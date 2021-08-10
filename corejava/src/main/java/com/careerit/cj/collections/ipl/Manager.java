package com.careerit.cj.collections.ipl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {

	public static void main(String[] args) throws IOException {

			IplStatService obj = new IplStatServiceImpl();

		List<RoleCountDTO> list = obj.getRoleCountAndAmount("RCB");
		list.stream().forEach(ele->{
			System.out.println(ele);
		});
	}
}
