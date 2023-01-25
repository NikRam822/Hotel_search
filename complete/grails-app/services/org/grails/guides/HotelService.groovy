package org.grails.guides

import grails.gorm.services.Service

@Service(Hotel)
interface HotelService {
    Hotel save(String title, Integer rating, String site, Country country)
    Hotel save(String title, Integer rating,  Country country)
}