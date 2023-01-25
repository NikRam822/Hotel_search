package org.grails.guides

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }
        "/search"(controller: 'MainPage', action: 'list')
        '/'(controller: 'home')
        '500'(view: '/error')
        '404'(view: '/notFound')
    }
}
