package com.ringcentral.definitions;

/** Query parameters for operation mthListNotes */
public class MthListNotesParameters {
    /** Thread owner extension IDs */
    public String[] ownerExtensionIds;

    public MthListNotesParameters ownerExtensionIds(String[] ownerExtensionIds) {
        this.ownerExtensionIds = ownerExtensionIds;
        return this;
    }

    /**
     * Availability filter (by default only `Alive` records are returned) Default: Alive Enum:
     * Alive, Deleted
     */
    public String[] availability;

    public MthListNotesParameters availability(String[] availability) {
        this.availability = availability;
        return this;
    }

    /** List of thread IDs to filter the list of results */
    public String[] threadIds;

    public MthListNotesParameters threadIds(String[] threadIds) {
        this.threadIds = threadIds;
        return this;
    }

    /** List of note IDs to filter the list of results */
    public String[] noteIds;

    public MthListNotesParameters noteIds(String[] noteIds) {
        this.noteIds = noteIds;
        return this;
    }

    /**
     * The number of items per page. If the provided value in the request is greater than a maximum,
     * the maximum value is applied Maximum: 1000 Minimum: 1 Format: int32 Example: 100 Default: 100
     */
    public Long perPage;

    public MthListNotesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * The result set page number (1-indexed) to return Maximum: 1000 Minimum: 1 Format: int32
     * Example: 1 Default: 1
     */
    public Long page;

    public MthListNotesParameters page(Long page) {
        this.page = page;
        return this;
    }
}
