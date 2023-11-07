package beans;

public class BoxingUnboxing 
{
	private int id;
	private float sal;
	private double bonus;
	private Integer id1;
	private Float sal1;
	private Double bonus1;
	
	
	

	public BoxingUnboxing() {
		super();
	}

	

	public BoxingUnboxing(int id, float sal, double bonus, Integer id1, Float sal1, Double bonus1) {
		super();
		this.id = id;
		this.sal = sal;
		this.bonus = bonus;
		this.id1 = id1;
		this.sal1 = sal1;
		this.bonus1 = bonus1;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Integer getId1() {
		return id1;
	}

	public void setId1(Integer id1) {
		this.id1 = id1;
	}

	public Float getSal1() {
		return sal1;
	}

	public void setSal1(Float sal1) {
		this.sal1 = sal1;
	}

	public Double getBonus1() {
		return bonus1;
	}

	public void setBonus1(Double bonus1) {
		this.bonus1 = bonus1;
	}



	
	
	@Override
	public String toString() {
		return "BoxingUnboxing [id=" + id + ", sal=" + sal + ", bonus=" + bonus + ", id1=" + id1 + ", sal1=" + sal1
				+ ", bonus1=" + bonus1 + "]";
	}

	


	public void boxing()
	{
		System.out.println("Boxing (Primitive to object) : ");
		id1=id;
		sal1=sal;
		bonus1=bonus;
		
		System.out.println("id1 = "+id1+"\nsal1 = "+sal1+"\nbonus1 = "+bonus1);
		
	}
	
	
	public void unboxing()
	{
		System.out.println("Unboxing (object to primitive) : ");
		Float f = new Float(sal1);
		Integer i=new Integer(id1);
		Double d= new Double(bonus1);
		
		sal=f.floatValue();
		id=i.intValue();
		bonus=d.doubleValue();
		System.out.println("id = "+id+"\nsal = "+sal+"\nbonus = "+bonus);
		
	}
	
	public void wrapperClassMethods() {
		int idd = 1;
		System.out.println("Compare "+id1.compareTo(idd));
		System.out.println("Addtion "+sal1.sum(10, 10));
		System.out.println("Value of "+bonus1.valueOf(sal1));
	}
}
