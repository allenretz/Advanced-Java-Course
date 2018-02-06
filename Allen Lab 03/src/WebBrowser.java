import java.io.*;
import java.net.URL;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class WebBrowser {
	private static String previousPage1 = "http://graceland.brightspace.com";
	private static String previousPage01 = "http://graceland.brightspace.com";
    private static String previousPage2 = "http://graceland.brightspace.com";
    private static String previousPage02 = "http://graceland.brightspace.com";
	public static void main(String[] args) throws IOException {
		JFrame      rootFrame    = new JFrame("Allen's Web Browser");
		JTabbedPane browserTab   = new JTabbedPane();
	    JEditorPane browserPane1 = new JEditorPane();
	    JEditorPane browserPane2 = new JEditorPane();
	    JTextField  url          = new JTextField("http://graceland.brightspace.com");
	    JButton searchButton     = new JButton("Preform Magic");
	    JButton backButton       = new JButton("<");
	    
	    
	    
	    int rootWidth  = 1200;
	    int rootHeight = 900;
	    //int rLOffset = 0;
	    //int rTOffset = 0;
	    int rROffset = 10;
	    int rBOffset = 24;
	    
	    
	    // Initialize Root Size
	    rootFrame.setSize(rootWidth, rootHeight);
	    rootFrame.setLayout(null);
	    rootFrame.setResizable(false);
	    rootFrame.setVisible(true);
	    rootFrame.setDefaultCloseOperation(rootFrame.EXIT_ON_CLOSE);
	    
	    rootFrame.add(browserTab);
	    rootFrame.add(url);
	    rootFrame.add(searchButton);
	    rootFrame.add(backButton);
	    
	    // Initialize Tab
	    browserTab.setBounds(5, 35, rootWidth - 5 - rROffset, rootHeight - 40 - rBOffset);
	    browserTab.addTab("~~ Your Tab Ad Here - $149.99/mo ~~", browserPane1);
	    browserTab.addTab("Tab Sponcered by Frivolous Co.", browserPane2);
	    browserTab.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) {
	    		if (browserTab.getSelectedIndex() < 1) {
	    			url.setText(browserPane1.getPage().toString());
	    		}
	    		else {
	    			url.setText(browserPane2.getPage().toString());
	    		}
	    	}
	    });
	    
	    // Initialize Browser Panes
	    browserPane1.setEditable(false);
	    browserPane2.setEditable(false);
	    updatePage(browserPane1, url.getText());
	    updatePage(browserPane2, url.getText());
	    
	    // Initialize URL
	    url.setEditable(true);
	    url.setBounds(51, 5, rootWidth - 125- 50 - rROffset, 25);
	    url.setText(browserPane1.getPage().toString());
	    
	    // Initialize Button
	    //searchButton.setBounds(0, rootWidth - 100, 100, 25);
	    searchButton.setBounds(rootWidth - 120 - rROffset,5,120,25);
	    searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[]a =doSearch(browserTab, browserPane1, browserPane2, url, previousPage01, previousPage1, previousPage02, previousPage2);
				previousPage01 = a[0];
				previousPage1  = a[1];
				previousPage02 = a[2];
				previousPage2  = a[3];
			}
	    });
	    backButton.setBounds(5,5,41,25);
	    backButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		if (browserTab.getSelectedIndex() < 1) {
	    			url.setText(previousPage01);
	    		}
	    		else {
	    			url.setText(previousPage02);
	    		}
	    		
				doSearch(browserTab, browserPane1, browserPane2, url,previousPage01, previousPage1,previousPage02, previousPage2);
			
	    	}
	    });
	    
	    
	    
	    
	    
	    //browserPane1.setPage("http://www.google.com");
	}
	
	public static void updatePage(JEditorPane browserPane, String u) {
		try {
		      browserPane.setPage(u);
		    }catch (IOException e) {
		        System.out.println("error loading page");
		    } 
	}
	
	// I thought about making rootFrame et. all Global
	public static String[] doSearch(JTabbedPane tab, JEditorPane p1,JEditorPane p2, JTextField u,String prev01, String prev1,String prev02, String prev2) {
		int ti =  tab.getSelectedIndex();
		if (ti == -1) {
			ti = 0;
		}
		if (ti == 0) {
			prev01 = prev1;
			prev1 = u.getText();
			updatePage(p1, u.getText());
			System.out.println("prev1= "+prev1);
			
		}else {
			prev02 = prev2;
			prev2 = u.getText();
			updatePage(p2, u.getText());
			System.out.println("prev2= "+prev2);
			
		}
		String[] ret = {prev01, prev1, prev02, prev2};
		return ret;
		
	}
}
