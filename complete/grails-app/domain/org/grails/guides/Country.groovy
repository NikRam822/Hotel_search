package org.grails.guides
@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Country {
    String title
    String capital
    static constraints = {
        title maxSize: 255, blank: false, unique: true
        capital maxSize: 128, blank: false
    }


    static hasMany = [hotel: Hotel]

    Country(String title, String capital) {
        this.title = title
        this.capital = capital
    }
}
