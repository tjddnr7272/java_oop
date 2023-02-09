package ezen.ams;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.WindowConstants;

/**
 * 계좌관리 애플리케이션 GUI
 * @author 김성욱
 * @Date   2023. 1. 16.
 */
public class AccountFrame extends Frame { 
	AccountRepository repository;
	
	GridBagLayout gridBagLayout;
	Label receiveLabel, attachLabel;
	TextField receiveTF, attachTF;
	Button searchButton;
	TextArea contentsArea;
	Button sendButton,cancleButton;
	Panel buttonPanel = new Panel();
	
	public AccountFrame() {
		this("기본타이틀",null);
	}

	public AccountFrame(String title, AccountRepository repository) {
	
		this.repository = repository;
	
	receiveLabel = new Label("받는사람");
	receiveTF = new TextField();
	attachLabel = new Label("첨부파일");
	attachTF = new TextField();
	searchButton = new Button("찾 기");
	contentsArea = new TextArea();
	sendButton = new Button("전 송");
	cancleButton = new Button("취 소");
	
	buttonPanel.add(sendButton);
	buttonPanel.add(cancleButton);
	
   }
	
	public void initLayout() {
	 	   gridBagLayout = new GridBagLayout();
     	   setLayout(gridBagLayout);
     	   add(receiveLabel,   0,0,1,1, 0.0);
     	   add(receiveTF,      1,0,2,1, 1.0);
     	   add(attachLabel,    0,1,1,1, 0.0);
     	   add(attachTF,       1,1,2,1, 1.0);
     	   add(searchButton,   3,1,1,1, 0.1);
     	   add(contentsArea,   0,2,4,2, 1.0);
     	   add(buttonPanel,    0,4,4,1, 1.0);
     	   
     	   
     	   
	}
	     // GridBagLayout을 이용한 컴포넌트 배치
        	public void add(Component component, int gridx, int gridy ,
        			int gridwidth , int gridheight, double weightx) {
        		 GridBagConstraints constraints = new GridBagConstraints();
           	   constraints.fill = GridBagConstraints.BOTH;
           	   constraints.insets = new Insets(5, 5, 5, 5);
           	   constraints.weightx = weightx; // 가중치
           	   constraints.weighty = 0.0;
           	   constraints.gridx = gridx;
           	   constraints.gridy = gridy;
           	   constraints.gridwidth = gridwidth;
           	   constraints.gridheight = gridheight;
           	   gridBagLayout.setConstraints(component, constraints);
           	   add(component);
		
 	}
	        
        	
        	
        	
        	
	
	// 이벤트 소스에 이벤트 리스너 연결(등록)
	public void addEventListener() {
	   addWindowListener(new WindowAdapter() {
		   @Override
		public void windowClosing(WindowEvent e) {
			   System.exit(0);
 		}

	   });
	   
	   searchButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			findByAccountNumber();
		}
	});
	}
     // 계좌 조회
	public void findByAccountNumber() {
	    String accountNum = attachTF.getText();
	    // 데이터 유효성 검증
	    if(accountNum == null || accountNum.trim().length() == 0) {
	    	System.out.println("계좌번호는 생략할 수 없습니다..");
	    	return;
	    }else {
	    	Account account = repository.findByNumber(accountNum);
	    	if(account != null) {
	    		contentsArea.append(account.toString() + "\n");
	    	}else{
	    		contentsArea.append("조회된 계좌가 존재하지 않습니다..");
	    	}
	    	
	    }
	    
	    
	}
    
	
	public static void main(String[] args) {
//		AccountFrame frame5 = new AccountFrame("AWT 컴포넌트틀");
//		frame5.initLayout();
//		frame5.addEventListener();
//		frame5.setSize(400, 400);
//		frame5.setVisible(true);
		
		
		
		
		
		
	}
	
}
