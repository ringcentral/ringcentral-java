package com.ringcentral.paths.restapi.account.extension.meetingconfiguration.profileimage

class Index(val parent: com.ringcentral.paths.restapi.account.extension.meetingconfiguration.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/profile-image"
    }

    /**
     * Operation: Upload User Meeting Profile Image
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting-configuration/profile-image
     */
    fun post(createUserMeetingProfileImageRequest: com.ringcentral.definitions.CreateUserMeetingProfileImageRequest): String? {
        val rb: okhttp3.ResponseBody =
            rc.post(this.path(), createUserMeetingProfileImageRequest, null, com.ringcentral.ContentType.MULTIPART)

        return rb.string()

    }

}
