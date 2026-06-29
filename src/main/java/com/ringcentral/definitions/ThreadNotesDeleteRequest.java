package com.ringcentral.definitions;

public class ThreadNotesDeleteRequest {
    /**
     * IDs of notes to be deleted Required Example:
     * c21e5807-a143-4bb2-b275-1e9f9695bd9a,60a8dbff-0e1e-4143-8114-9424675f9890
     */
    public String[] ids;

    public ThreadNotesDeleteRequest ids(String[] ids) {
        this.ids = ids;
        return this;
    }
}
