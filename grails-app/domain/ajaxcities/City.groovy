package ajaxcities

class City {
	String city
    static constraints = {
		city nullable:false, blank:false, maxSize:200
    }
}
