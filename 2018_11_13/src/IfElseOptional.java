import java.util.Optional;


class ContInfo {
	String phone;
	String adrs;
	public ContInfo(String ph , String ad) {
		phone = ph;
		adrs = ad;
		
	}
	public String getPhone() {return phone; }
	public String getAdrs() {return adrs;}
}


public class IfElseOptional {

	public static void main(String[] args) {
		ContInfo ci = new ContInfo(null , "Republic of Korea");
		String phone;
		String addr;
		
		if(ci.phone !=null)
			phone = ci.getPhone();
		else 
			phone="There is no phone num";
		if(ci.adrs != null)
			addr = ci.getAdrs();
		else 
			addr = "There is no address";
		

		System.out.println(phone);
		System.out.println(addr);
		
		//���� if else ������� ���Ⱑ �ȴ� !! �����ϰ� ������
		
		
		// ù ���� : map �޼ҵ� 
		Optional<String> os1 = Optional.of("Optional String");
		Optional<String> os2 = os1.map(s->s.toUpperCase());
		System.out.println(os2.get());
		
		Optional<String> o3 = os1.map(s->s.replace(' ','_')).map(s->s.toLowerCase());
		System.out.println(o3.get());
		
		// �ι�° ���� : orElse �޼ҵ�
		Optional<String> os3 = Optional.empty();
		Optional<String> os4 = Optional.of("So Basic");
		
		String s1 = os3.map(s->s.toString()).orElse("Empty");
		String s2 = os4.map(s->s.toString()).orElse("Empty");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
	}

}
