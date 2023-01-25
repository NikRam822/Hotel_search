package org.grails.guides

class CountryEditController {
    Country currentCountry
    CountryDataService countryDataService

    def index(String capital, String title) {
        currentCountry = Country.findByTitle(title)
        render(view: "index", model: [title: title, capital: capital])
    }

    def update(String capital, String title) {
        countryDataService.update(title, capital, currentCountry)

        render(view: "index", model: [title: title, capital: capital])
    }

    def save(String capital, String title) {
        countryDataService.save(title, capital)

        render(view: "save", model: [title: title, capital: capital])
    }

    def delete() {

       countryDataService.delete(currentCountry)

       redirect(controller: "Home", action: "countries")
    }
}
