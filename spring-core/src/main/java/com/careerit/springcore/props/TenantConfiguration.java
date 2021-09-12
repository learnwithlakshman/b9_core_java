package com.careerit.springcore.props;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "tenant")
public class TenantConfiguration {
	
		private List<Tenant> tenantList;
        private Map<String,Tenant> map ;
		
        @PostConstruct
		public void init() {
        	map = tenantList.stream().collect(Collectors.toMap(Tenant::getName,ele->ele));
        }
        public Tenant getTenantDetails(String tname) {
        	Tenant tenant = map.get(tname);
        	if(tenant == null) {
        		throw new IllegalArgumentException("Tenant name is not found");
        	}
        	return tenant;
        }
		public List<Tenant> getTenantList() {
			return tenantList;
		}

		public void setTenantList(List<Tenant> tenantList) {
			this.tenantList = tenantList;
		}
		
		
}
