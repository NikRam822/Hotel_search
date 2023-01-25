package org.grails.guides

class HotelEditController {
    List<Country> countries = Country.findAll()

    Hotel currentHotel
    HotelDataService hotelDataService

    def index(String rating, String title, String site, String country) {

        currentHotel = Hotel.findByTitleAndCountry(title, Country.findByTitle(country))

        render(view: "index", model: [title: title, rating: rating, site: site, countries: countries, country: country])
    }

    def update(String rating, String title, String site, String country) {

        hotelDataService.update(title, rating as Integer, site, Country.findByTitle(country), currentHotel)

        render(view: "index", model: [title: title, rating: rating, site: site, countries: countries, country: country])
    }

    def save(String rating, String title, String site, String country) {

        hotelDataService.save(rating, title, site, country)

        render(view: "save", model: [title: title, rating: rating, site: site, countries: countries, country: country])
    }

    def delete() {

        hotelDataService.delete(currentHotel)

        redirect(controller: "Home", action: "hotels")
    }
}
