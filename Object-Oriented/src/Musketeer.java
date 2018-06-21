
public class Musketeer {

	private String m_name;
	private int m_age;
	
	public Musketeer(String name, int age) {
		this.m_name  = name;
		this.m_age = age;
	}
	
	public static final int S_DEFAULT_AGE = 35;
	
	public Musketeer(String name) {
		this.m_name = name;
		this.m_age = S_DEFAULT_AGE;
	}
	
	public static final String S_DEFAULT_NAME = "Unknown";
	
	public Musketeer() {
		this.setM_name(S_DEFAULT_NAME);
		this.setM_age(S_DEFAULT_AGE);
		
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getM_age() {
		return m_age;
	}

	public void setM_age(int m_age) {
		this.m_age = m_age;
	}
	
	
}
