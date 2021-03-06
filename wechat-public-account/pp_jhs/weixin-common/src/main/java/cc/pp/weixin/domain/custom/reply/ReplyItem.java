package cc.pp.weixin.domain.custom.reply;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import cc.pp.weixin.constant.CustomConstant;

/**
 * 自定义回复信息载体
 * @author wgybzb
 * @since  2013-04-26
 */
public class ReplyItem implements Serializable{
	/**
	 * 默认的序列化版本号
	 */
	private static final long serialVersionUID = -8818487518015906451L;

	/**
	 * 回复标题
	 */
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * 回复消息跳转链接
	 */
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 图片链接，支持JPG、PNG格式，
	 * 较好的效果为大图640*320，小图80*80，
	 * 限制图片链接的域名需要与开发者填写的基本资料中的Url一致
	 */
	private String picUrl;
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	/**
	 * 自定义回复对应的关键词列表
	 */
	List<String> keyWordList = new ArrayList<String>();
	public List<String> getKeyWordList() {
		return keyWordList;
	}
	public void setKeyWordList(List<String> keyWordList) {
		this.keyWordList = keyWordList;
	}
	public void setKeyWordList(String keyWords) {
		if (StringUtils.isEmpty(keyWords)){
			return;
		}
		String[] keyWordArr = keyWords.split(CustomConstant.SPLIT_FLAG);
		if (keyWordArr !=null && keyWordArr.length > 0){
			for (String keyWord:keyWordArr){
				keyWordList.add(keyWord);
			}
		}
	}

	/**
	 * 回复描述
	 */
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 回复描述内容
	 */
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}