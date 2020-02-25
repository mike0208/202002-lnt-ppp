package in.conceptarchitect.booksearchengine;

import in.conceptarchitect.searchengine.Query;

public class BookSearchQuery implements Query {
	String tag;

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag.toLowerCase();
	}

	public BookSearchQuery(String tag) {
		super();
		this.tag = tag.toLowerCase();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookSearchQuery other = (BookSearchQuery) obj;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		return true;
	}
	
	
	
}
