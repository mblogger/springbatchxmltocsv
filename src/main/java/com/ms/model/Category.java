package com.ms.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.ms.adapter.JaxbCategoryItemAdapter;

@XmlRootElement(name = "category")
public class Category {

	private String name;
	private boolean is_active;
	private String description;
	private boolean is_anchor;
	private String url_key;
	private boolean include_in_menu;
	private String meta_description;
	private String meta_keywords;
	private String meta_title;
	private String parent;

	@XmlJavaTypeAdapter(JaxbCategoryItemAdapter.class)
	@XmlElement(name = "name")
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "is_active")
	/**
	 * @return the is_active
	 */
	public boolean isIs_active() {
		return is_active;
	}

	/**
	 * @param is_active
	 *            the is_active to set
	 */
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	@XmlJavaTypeAdapter(JaxbCategoryItemAdapter.class)
	@XmlElement(name = "description")
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElement(name = "is_anchor")
	/**
	 * @return the is_anchor
	 */
	public boolean isIs_anchor() {
		return is_anchor;
	}

	/**
	 * @param is_anchor
	 *            the is_anchor to set
	 */
	public void setIs_anchor(boolean is_anchor) {
		this.is_anchor = is_anchor;
	}

	@XmlJavaTypeAdapter(JaxbCategoryItemAdapter.class)
	@XmlElement(name = "url_key")
	/**
	 * @return the url_key
	 */
	public String getUrl_key() {
		return url_key;
	}

	/**
	 * @param url_key
	 *            the url_key to set
	 */
	public void setUrl_key(String url_key) {
		this.url_key = url_key;
	}

	@XmlElement(name = "include_in_menu")
	/**
	 * @return the include_in_menu
	 */
	public boolean isInclude_in_menu() {
		return include_in_menu;
	}

	/**
	 * @param include_in_menu
	 *            the include_in_menu to set
	 */
	public void setInclude_in_menu(boolean include_in_menu) {
		this.include_in_menu = include_in_menu;
	}

	@XmlJavaTypeAdapter(JaxbCategoryItemAdapter.class)
	@XmlElement(name = "meta_description")
	/**
	 * @return the meta_description
	 */
	public String getMeta_description() {
		return meta_description;
	}

	/**
	 * @param meta_description
	 *            the meta_description to set
	 */
	public void setMeta_description(String meta_description) {
		this.meta_description = meta_description;
	}

	@XmlJavaTypeAdapter(JaxbCategoryItemAdapter.class)
	@XmlElement(name = "meta_keywords")
	/**
	 * @return the meta_keywords
	 */
	public String getMeta_keywords() {
		return meta_keywords;
	}

	/**
	 * @param meta_keywords
	 *            the meta_keywords to set
	 */
	public void setMeta_keywords(String meta_keywords) {
		this.meta_keywords = meta_keywords;
	}

	@XmlJavaTypeAdapter(JaxbCategoryItemAdapter.class)
	@XmlElement(name = "meta_title")
	/**
	 * @return the meta_title
	 */
	public String getMeta_title() {
		return meta_title;
	}

	/**
	 * @param meta_title
	 *            the meta_title to set
	 */
	public void setMeta_title(String meta_title) {
		this.meta_title = meta_title;
	}

	@XmlJavaTypeAdapter(JaxbCategoryItemAdapter.class)
	@XmlElement(name = "parent")
	/**
	 * @return the parent
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * @param parent
	 *            the parent to set
	 */
	public void setParent(String parent) {
		this.parent = parent;
	}

}
