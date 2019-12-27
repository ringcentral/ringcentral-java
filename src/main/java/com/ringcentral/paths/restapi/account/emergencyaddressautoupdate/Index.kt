package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/emergency-address-auto-update"
    }


    fun users(): com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.Index {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.users.Index(this)
    }


    @JvmOverloads
    fun wirelesspoints(pointId: String? = null): com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspoints.Index {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspoints.Index(this, pointId)
    }


    @JvmOverloads
    fun networks(networkId: String? = null): com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.networks.Index {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.networks.Index(this, networkId)
    }


    fun devices(): com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.Index {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.devices.Index(this)
    }


    @JvmOverloads
    fun switches(switchId: String? = null): com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switches.Index {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switches.Index(this, switchId)
    }


    fun switchesbulkcreate(): com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkcreate.Index {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkcreate.Index(this)
    }


    fun switchesbulkupdate(): com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkupdate.Index {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkupdate.Index(this)
    }


    fun wirelesspointsbulkcreate(): com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkcreate.Index {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkcreate.Index(this)
    }


    fun wirelesspointsbulkupdate(): com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkupdate.Index {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkupdate.Index(this)
    }


    fun wirelesspointsbulkvalidate(): com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkvalidate.Index {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkvalidate.Index(this)
    }


    fun switchesbulkvalidate(): com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkvalidate.Index {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkvalidate.Index(this)
    }


    @JvmOverloads
    fun tasks(taskId: String? = null): com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.tasks.Index {
        return com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.tasks.Index(this, taskId)
    }

}
