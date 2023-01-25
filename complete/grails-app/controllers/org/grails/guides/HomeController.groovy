package org.grails.guides

class HomeController {

    List<Hotel> result
    List<Country> countries = Country.findAll()

    def index() {
        List<Country> countries = Country.findAll()
        render(view: 'index', model: [result: result, countries: countries])

    }

    def search(String selection, String find) {
        def results = Hotel.createCriteria().list {
            order("title", "desc")

        }

        if (selection == "all") {
            result = Hotel.findAllByTitleLike("%" + find + "%")

        } else {
            result = Hotel.findAllByTitleLikeAndCountry("%" + find + "%", Country.findByTitle(selection))
        }

        if (result?.size() != 0) {
            List<Hotel> view = result
            if (result.size() >= 10) {
                view = result[1..10]
            }
            render(view: 'search', model: [result: view, countries: countries, total: result.size()])
        } else {
            render(view: 'index', model: [result: result, countries: countries])
        }
    }

    def list() {
        String offsetRead = params.offset
        Integer offset = Integer.parseInt(offsetRead)
        if ((offset + 9) >= result.size()) {
            render(view: 'search', model: [result: result[offset..result.size() - 1], total: result.size()])

        } else
            render(view: 'search', model: [result: result[offset..offset + 9], total: result.size()])

    }

    def home() {
        redirect(controller: "Home", action: "index")
    }

    def hotels() {

        search("all", "")
    }

    def countries(String title, String capital) {
        countries=Country.findAll()
        if (countries?.size() != 0) {
            List<Country> view = countries
            if (countries.size() >= 10) {
                view =countries[0..9]
            }
            render(view: 'countries', model: [result: view, total: countries.size()])

        }
    }
    def countryList() {
        countries=Country.findAll()
        String offsetRead = params.offset
        Integer offset = Integer.parseInt(offsetRead)
        if ((offset + 9) >= countries.size()) {
            render(view: 'countries', model: [result: countries[offset..countries.size() - 1], total: countries.size()])

        } else
            render(view: 'countries', model: [result: countries[offset..offset + 9], total: countries.size()])

    }
}