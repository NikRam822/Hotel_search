package org.grails.guides

import grails.gorm.transactions.Transactional

@Transactional
class CountryDataService {

    def update(String title, String capital, Country country) {

        country.setTitle(title)
        country.setCapital(capital)
        country.save()
        return country

    }

    def delete(Country country) {

        country.delete()

    }

    def save(String title, String capital) {

        Country country = new Country(title, capital)
        country.save()
    }
}
