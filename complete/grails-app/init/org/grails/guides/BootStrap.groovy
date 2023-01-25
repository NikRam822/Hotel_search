package org.grails.guides

import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {


    CountryService countryService
    HotelService hotelService
    def init = { servletContext ->


        Country country1 = countryService.save("aaaaaaaa", "aaaaaaaaaa")
        Country country2 = countryService.save("bbbb", "cccc")
        Country country3 = countryService.save("dddd", "dddddt")
        Country country4 = countryService.save("eeee", "eeeee")
        Country country5 = countryService.save("fffff", "fff")
        Country country6 = countryService.save("ggggg", "ggggg")
        Country country7 = countryService.save("hhhhh", "hhhhh")
        Country country8 = countryService.save("iiii", "iiii")
        Country country9 = countryService.save("jjjjjj", "jjjjjj")
        Country country10 = countryService.save("kkkkk", "kkkkkkkkkkk")
        Country country11 = countryService.save("lllllll", "lllllll")
        Country country12 = countryService.save("mmmmmmm", "mmmmmmm")

        hotelService.save("aaaaa", 4, "http://www.google.com", country1)
        hotelService.save("bbbbb", 5, "https://www.google.com", country2)
        hotelService.save("ccccc", 4, "http://www.google.com", country3)
        hotelService.save("ddddd", 5, "https://www.google.com", country4)
        hotelService.save("eeeee", 4, "http://www.google.com", country5)
        hotelService.save("fffff", 5, "https://www.google.com", country5)
        hotelService.save("ggggg", 4, "http://www.google.com", country6)
        hotelService.save("hhhhh", 5, "https://www.google.com", country7)
        hotelService.save("iiiii", 4, country8)
        hotelService.save("jjjjj", 5, country9)
        hotelService.save("kkkkk", 4, "http://www.google.com", country2)
        hotelService.save("lllll", 5, "https://www.google.com", country10)
        hotelService.save("mmmmm", 4, "http://www.google.com", country11)
        hotelService.save("aajaa", 5, "https://www.google.com", country2)
        hotelService.save("hjjff", 3, "https://www.google.com", country2)

        hotelService.save("aaaaaas", 4, "http://www.google.com", country1)
        hotelService.save("bbbbasasb", 5, "https://www.google.com", country2)
        hotelService.save("cccasascc", 4, "http://www.google.com", country3)
        hotelService.save("dddasasdd", 5, "https://www.google.com", country4)
        hotelService.save("eesaseee", 4, "http://www.google.com", country5)
        hotelService.save("ffdsfff", 5, "https://www.google.com", country5)
        hotelService.save("ggdsggg", 4, "http://www.google.com", country6)
        hotelService.save("hhshhh", 5, "https://www.google.com", country7)
        hotelService.save("iidsdiii", 4, country8)
        hotelService.save("jjsdsdjjj", 5, country9)
        hotelService.save("kkdggfkkk", 4, "http://www.google.com", country2)
        hotelService.save("llfdfdlll", 5, "https://www.google.com", country10)
        hotelService.save("mmdgfmmm", 4, "http://www.google.com", country11)
        hotelService.save("aafgfjaa", 5, "https://www.google.com", country2)
        hotelService.save("hjhthjff", 3, "https://www.google.com", country2)
    }
    def destroy = {
    }
}
