package ch06;

/**
 * @�ۼ��� : ���ټ�
 * @��¥ : 2017. 1. 25.
 * @���� : ��� ����
 * 			Phone :	����(�ѱ�,����), ��, ��ȭ(���,���ϱ�), �𵨸�, ���� 
 * 			DMB Phone : ����(�ѱ�,����), ��, ��ȭ(���,���ϱ�), �𵨸�, ����, DMB���(DMB ����, ����, ä��)
 */

class CellPhone{
	//�ʵ� - ������ �� 
	protected String model;
	protected String color;
	
	//�޼ҵ� - ���۵� 
	//������� 
	public void powerOn () {
		System.out.println("������ �մϴ�");
	}
	
	public void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	
	//��
	public void bell() {
		System.out.println("���� �︳�ϴ�");
	}
	
	//��ȭ���
	public void sendVoice(String message) {
		System.out.println("me : " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("you : " + message);
	}
	
	public void hangUp() {
		System.out.println("��ȭ�� �����ϴ�" + "\t");
	}
	
}

class DMBPhone extends CellPhone {
	private int channel;
	
	public DMBPhone(String model, String color , int channel) {
		super.model = model;
		super.color = color;
		this.channel = channel;
	}
	
	//DMB��� (DMB (����, �ѱ�), ä�� ����)
	public void turnOnDmb() {
		System.out.println("ä�� : " + channel + " �� ä���� DMB ��� ������ �����մϴ�");
	}
	
	public void changeChannel(int channel){
		this.channel = channel;
		System.out.println("ä�� : " + this.channel);
	}
	
	public void turnOffDmb() {
		System.out.println("ä�� : " + channel + " �� ä���� DMB ��� ������ �����մϴ�");	
	}
	
	public void disp() {
		System.out.println("�� : " + model);
		System.out.println("���� : " + color);
		System.out.println("ä�� : " + channel + "\n");
	}
	
}

public class Exam81 {
	public static void main(String[] args) {
		DMBPhone dmb = new DMBPhone("������" , "���", 11);
		dmb.disp();
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������");
		dmb.receiveVoice("�ȳ��ϼ��� ���� ���߱��Դϴ�");
		dmb.sendVoice("���!! ����");
		dmb.hangUp();

		dmb.turnOnDmb();
		dmb.changeChannel(7);
		dmb.turnOffDmb();
		
		dmb.powerOff();

		
	}

}
