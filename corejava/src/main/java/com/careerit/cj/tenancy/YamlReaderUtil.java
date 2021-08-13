package com.careerit.cj.tenancy;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class YamlReaderUtil {

	public static List<Tenant> loadTenantDetails() {

		Yaml yaml = new Yaml(new Constructor(Tenant.class));
		List<Tenant> tenantDetailsList = new ArrayList<>();
		try (InputStream in = YamlReaderUtil.class.getResourceAsStream("/tenant-details.yml")) {
			yaml.loadAll(in).forEach(o -> tenantDetailsList.add((Tenant) o));
		} catch (IOException ex) {
			String errMsg = String.format("Error reading YAML Tenant configuration file %s", ex.getMessage());
			System.out.println(errMsg);
		}

		return tenantDetailsList;

	}

	public static void main(String[] args) {
			List<Tenant> list = loadTenantDetails();
			list.stream().forEach(t->{
				System.out.println(t);
			});
		}
}
