package zhiHuUserSprider.bean;

/**
 * 知乎用户bean
 * 
 * @author KKys
 *
 */

public class ZhiHuUserBean {

	String name;// 用户姓名

	int sex;//性别
	
	String business;// 行业
	
	String company;// 公司
	
	String position;// 职位;
	
	String education;// 大学
	
	String major;// 专业

	String answersNum;// 回答数量

	public String getEssayNum() {
		return essayNum;
	}

	public void setEssayNum(String essayNum) {
		this.essayNum = essayNum;
	}

	public String getCollumnNum() {
		return collumnNum;
	}

	public void setCollumnNum(String collumnNum) {
		this.collumnNum = collumnNum;
	}

	public String getShareNum() {
		return shareNum;
	}

	public void setShareNum(String shareNum) {
		this.shareNum = shareNum;
	}

	String essayNum;// 文章数量

	String collumnNum;// 专栏数量

	String shareNum;// 分享数量

	public String getAskNum() {
		return askNum;
	}

	public void setAskNum(String askNum) {
		this.askNum = askNum;
	}

	String askNum;// 提问数量

	String starsNum;// 被赞同数

	String thxNum;// 被感谢数

	String followingNum;//关注的人

	String followersNum;//关注者数量

	String havePublicAccount; //是否有公众号

	public String getHavePublicAccount() {
		return havePublicAccount;
	}

	public void setHavePublicAccount(String havePublicAccount) {
		this.havePublicAccount = havePublicAccount;
	}




	@Override
	public String toString() {
		return "ZhiHuUserBean{" +
				"name='" + name + '\'' +
				", sex=" + sex +
				", business='" + business + '\'' +
				", company='" + company + '\'' +
				", position='" + position + '\'' +
				", education='" + education + '\'' +
				", major='" + major + '\'' +
				", answersNum=" + answersNum +
				", starsNum=" + starsNum +
				", thxNum=" + thxNum +
				", followingNum=" + followingNum +
				", followersNum=" + followersNum +
				'}';
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public String getEducation() {
		return education;
	}



	public void setEducation(String education) {
		this.education = education;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}

	public String getAnswersNum() {
		return answersNum;
	}

	public void setAnswersNum(String answersNum) {
		this.answersNum = answersNum;
	}

	public String getFollowersNum() {
		return followersNum;
	}

	public void setFollowersNum(String followersNum) {
		this.followersNum = followersNum;
	}

	public String getFollowingNum() {
		return followingNum;
	}

	public void setFollowingNum(String followingNum) {
		this.followingNum = followingNum;
	}

	public String getThxNum() {
		return thxNum;
	}

	public void setThxNum(String thxNum) {
		this.thxNum = thxNum;
	}

	public String getStarsNum() {
		return starsNum;
	}

	public void setStarsNum(String starsNum) {
		this.starsNum = starsNum;
	}
}
