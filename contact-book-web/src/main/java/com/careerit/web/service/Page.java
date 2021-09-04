package com.careerit.web.service;

import java.util.List;

public class Page<T> {

		private int total;
		private List<T> data;
		private int size;
		private int page;
		
		
		public Page() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Page(int total, List<T> data, int size, int page) {
			super();
			this.total = total;
			this.data = data;
			this.size = size;
			this.page = page;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public List<T> getData() {
			return data;
		}
		public void setData(List<T> data) {
			this.data = data;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getPage() {
			return page;
		}
		public void setPage(int page) {
			this.page = page;
		}
		
}
