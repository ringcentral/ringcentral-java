package com.ringcentral.paths.restapi.dictionary

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/dictionary"
    }


    fun faxcoverpage(): com.ringcentral.paths.restapi.dictionary.faxcoverpage.Index {
        return com.ringcentral.paths.restapi.dictionary.faxcoverpage.Index(this)
    }


    @JvmOverloads
    fun greeting(greetingId: String? = null): com.ringcentral.paths.restapi.dictionary.greeting.Index {
        return com.ringcentral.paths.restapi.dictionary.greeting.Index(this, greetingId)
    }


    @JvmOverloads
    fun language(languageId: String? = null): com.ringcentral.paths.restapi.dictionary.language.Index {
        return com.ringcentral.paths.restapi.dictionary.language.Index(this, languageId)
    }


    @JvmOverloads
    fun country(countryId: String? = null): com.ringcentral.paths.restapi.dictionary.country.Index {
        return com.ringcentral.paths.restapi.dictionary.country.Index(this, countryId)
    }


    fun location(): com.ringcentral.paths.restapi.dictionary.location.Index {
        return com.ringcentral.paths.restapi.dictionary.location.Index(this)
    }


    @JvmOverloads
    fun state(stateId: String? = null): com.ringcentral.paths.restapi.dictionary.state.Index {
        return com.ringcentral.paths.restapi.dictionary.state.Index(this, stateId)
    }


    @JvmOverloads
    fun timezone(timezoneId: String? = null): com.ringcentral.paths.restapi.dictionary.timezone.Index {
        return com.ringcentral.paths.restapi.dictionary.timezone.Index(this, timezoneId)
    }

}