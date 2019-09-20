package interfacePKG;

public class MOTO implements Mobiles {
	
	public static void main(String[] args) {
		
		Mobiles i= new MOTO();
		
		i.Camera("DualCam", 12.3);
		i.Display("Tempared", 12.50);
		i.Memory(35.00);
		i.OS("Android");
		i.Ram(12.00);
		
		
	}

	@Override
	public void Display(String Display, Double dimen) {
		// TODO Auto-generated method stub
		System.out.println("This is MOTO mobile Tempared Display");
		
	}

	@Override
	public void OS(String Operat) {
		// TODO Auto-generated method stub
		System.out.println("This is MOTO with Android OS");
		
	}

	@Override
	public void Camera(String dualcam, Double MP) {
		// TODO Auto-generated method stub
		System.out.println("This MOTO mobile has Dual cam");
	}

	@Override
	public void Ram(Double Randum) {
		// TODO Auto-generated method stub
		System.out.println("This MOTO mobile has Ram");
	}

	@Override
	public void Memory(Double Memo) {
		// TODO Auto-generated method stub
		System.out.println("This MOTO mobile has Memory");
		
	}

}
