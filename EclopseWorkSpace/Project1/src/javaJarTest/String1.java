package javaJarTest;

public class String1 {

	//usage of charAt
	public void strOccur(){
			// ����һ���ַ���
			String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
	        
	        // ���ִ���
			int num = 0;
//	        byte[] a=s.getBytes();
	         // ѭ������ÿ���ַ����ж��Ƿ����ַ� a ������ǣ��ۼӴ���
			for (int i=0;i<s.length();i++)
			{
	            // ��ȡÿ���ַ����ж��Ƿ����ַ�a
				if (s.charAt(i)=='a') {
	                // �ۼ�ͳ�ƴ���
					num++; 
				}
			}
			System.out.println("�ַ�a���ֵĴ�����" + num);
		}
	//useage of StringBuilder
	public void strbuilder(){
		// ����һ���յ�StringBuilder����
		StringBuilder str=new StringBuilder();
        
		// ׷���ַ���
		str.append("jaewkjldfxmopzdm");
		
        // �Ӻ���ǰÿ����λ���붺��
		int len=str.length();
		for(int i=(len-3);i>0;i=i-3){
			str.insert(i, ",");
		}     
		
        // ��StringBuilder����ת��ΪString�������
		System.out.print(str.toString());
	}
	//װ�䣬����
	public void caseConvert(){
		 // ����double���ͱ���
		double a = 91.5;
        
         // �ֶ�װ��
		Double b = new Double(a);       
        
        // �Զ�װ��
		Double c = a;      

        System.out.println("װ���Ľ��Ϊ��" + b + "��" + c);
        
        // ����һ��Double��װ�����ֵΪ8
		Double d = new Double(87.0);
        
        // �ֶ�����
		double e = d.doubleValue();
        // �Զ�����
		double f = d ;
        
         System.out.println("�����Ľ��Ϊ��" + e + "��" + f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String1 str=new String1();
//		str.strOccur();
//		str.strbuilder();
		str.caseConvert();

	}

}