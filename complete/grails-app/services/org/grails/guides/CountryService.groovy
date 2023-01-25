package org.grails.guides

import grails.gorm.services.Service

@Service(Country)
interface CountryService {
Country save(String title, String  capital)
}