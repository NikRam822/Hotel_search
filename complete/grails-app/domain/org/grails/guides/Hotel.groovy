package org.grails.guides

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Hotel {

    Hotel(String title, Integer rating, String site, Country country) {
        this.title = title
        this.rating = rating
        this.site = site
        this.country = country
    }
    Hotel(String title, Integer rating, Country country) {
        this.title = title
        this.rating = rating
        this.country = country
    }

    String title
    Integer rating
    String site
    Country country
    static constraints = {
        title blank: false, maxSize: 255, unique: 'country'
        rating blank: false, range: 1..5
        site blank: true, nullable: true, validator: {
            if (it != null && it!="") {
                if (!it.startsWith("http://") && !it.startsWith("https://")) {
                    log.fatal("Incorrect value: " + it)
                }
            }
        }
        // country blank: //false,
    }

    static mapping = {
        sort rating: "desc"/*, title: "desc"*/

    }
    static belongsTo = [country: Country]
}
