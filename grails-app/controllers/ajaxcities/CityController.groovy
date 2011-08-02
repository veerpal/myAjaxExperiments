package ajaxcities
import grails.converters.*
class CityController {

    def index = { }
	
	def ajaxFindCity = {
		log.debug "Find city:${params.term}"
		def foundCities = City.withCriteria {
         ilike 'city', params.term + '%'
		}
		render (foundCities?.'city' as JSON)
	}
}
