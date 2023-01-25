package org.grails.guides

import grails.gorm.transactions.Transactional

@Transactional
class HotelDataService {

    def update(String title, Integer rating, String site, Country country, Hotel hotel) {

        hotel.setTitle(title)
        hotel.setRating(rating)
        if (site != "" && site != null) {
            hotel.setSite(site)
        }

        hotel.setCountry(country)
        hotel.save()
        return hotel

    }

    def delete(Hotel hotel) {

        hotel.delete()

    }

    def save(String rating, String title, String site, String country) {

        if (site != null && site != "") {
            Hotel hotel = new Hotel(title, rating as Integer, site, Country.findByTitle(country))
            hotel.save()
        } else {
            Hotel hotel = new Hotel(title, rating as Integer, Country.findByTitle(country))
            hotel.save()
        }

    }
}
