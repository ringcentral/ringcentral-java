package com.ringcentral.paths;

import com.ringcentral.PathSegment;
import com.ringcentral.definitions.LanguageInfo;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;

public class Language {
    private PathSegment pathSegment;

    public Language(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "language", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public static class ListResponse {
        // Language data
        public LanguageInfo[] records;
        // Information on navigation
        public NavigationInfo navigation;
        // Information on paging
        public PagingInfo paging;

        public ListResponse records(LanguageInfo[] records) {
            this.records = records;
            return this;
        }

        public ListResponse navigation(NavigationInfo navigation) {
            this.navigation = navigation;
            return this;
        }

        public ListResponse paging(PagingInfo paging) {
            this.paging = paging;
            return this;
        }
    }
}
