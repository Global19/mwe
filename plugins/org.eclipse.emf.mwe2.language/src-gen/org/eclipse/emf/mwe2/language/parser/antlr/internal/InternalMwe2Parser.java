package org.eclipse.emf.mwe2.language.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMwe2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'module'", "'var'", "'='", "'@'", "':'", "'auto-inject'", "'{'", "'}'", "'import'", "'.*'", "'true'", "'false'", "'.'", "'${'", "'\\''", "'\"'", "'\\\\'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int EOF=-1;
    public static final int RULE_ANY_OTHER=6;
    public static final int RULE_SL_COMMENT=8;

        public InternalMwe2Parser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g"; }



     	private Mwe2GrammarAccess grammarAccess;
     	
        public InternalMwe2Parser(TokenStream input, IAstFactory factory, Mwe2GrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Module";	
       	} 



    // $ANTLR start entryRuleModule
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:72:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:73:2: (iv_ruleModule= ruleModule EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:74:2: iv_ruleModule= ruleModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule75);
            iv_ruleModule=ruleModule();
            _fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModule


    // $ANTLR start ruleModule
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:81:1: ruleModule returns [EObject current=null] : ( () 'module' ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_canonicalName_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_declaredProperties_4_0 = null;

        EObject lv_root_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:86:6: ( ( () 'module' ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:87:1: ( () 'module' ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:87:1: ( () 'module' ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:87:2: () 'module' ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:87:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:88:5: 
            {
             
                    temp=factory.create(grammarAccess.getModuleAccess().getModuleAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getModuleAccess().getModuleAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,9,FOLLOW_9_in_ruleModule129); 

                    createLeafNode(grammarAccess.getModuleAccess().getModuleKeyword_1(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:102:1: ( (lv_canonicalName_2_0= ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:103:1: (lv_canonicalName_2_0= ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:103:1: (lv_canonicalName_2_0= ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:104:3: lv_canonicalName_2_0= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleModule150);
            lv_canonicalName_2_0=ruleFQN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"canonicalName",
            	        		lv_canonicalName_2_0, 
            	        		"FQN", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:126:2: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:127:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:127:1: (lv_imports_3_0= ruleImport )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:128:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModule171);
            	    lv_imports_3_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imports",
            	    	        		lv_imports_3_0, 
            	    	        		"Import", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:150:3: ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==10) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:151:1: (lv_declaredProperties_4_0= ruleDeclaredProperty )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:151:1: (lv_declaredProperties_4_0= ruleDeclaredProperty )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:152:3: lv_declaredProperties_4_0= ruleDeclaredProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaredProperty_in_ruleModule193);
            	    lv_declaredProperties_4_0=ruleDeclaredProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"declaredProperties",
            	    	        		lv_declaredProperties_4_0, 
            	    	        		"DeclaredProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:174:3: ( (lv_root_5_0= ruleRootComponent ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:175:1: (lv_root_5_0= ruleRootComponent )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:175:1: (lv_root_5_0= ruleRootComponent )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:176:3: lv_root_5_0= ruleRootComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getRootRootComponentParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRootComponent_in_ruleModule215);
            lv_root_5_0=ruleRootComponent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"root",
            	        		lv_root_5_0, 
            	        		"RootComponent", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModule


    // $ANTLR start entryRuleDeclaredProperty
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:206:1: entryRuleDeclaredProperty returns [EObject current=null] : iv_ruleDeclaredProperty= ruleDeclaredProperty EOF ;
    public final EObject entryRuleDeclaredProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredProperty = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:207:2: (iv_ruleDeclaredProperty= ruleDeclaredProperty EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:208:2: iv_ruleDeclaredProperty= ruleDeclaredProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclaredPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclaredProperty_in_entryRuleDeclaredProperty251);
            iv_ruleDeclaredProperty=ruleDeclaredProperty();
            _fsp--;

             current =iv_ruleDeclaredProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredProperty261); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDeclaredProperty


    // $ANTLR start ruleDeclaredProperty
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:215:1: ruleDeclaredProperty returns [EObject current=null] : ( 'var' ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) ( '=' ( (lv_default_4_0= ruleValue ) ) )? ) ;
    public final EObject ruleDeclaredProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_default_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:220:6: ( ( 'var' ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) ( '=' ( (lv_default_4_0= ruleValue ) ) )? ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:221:1: ( 'var' ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) ( '=' ( (lv_default_4_0= ruleValue ) ) )? )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:221:1: ( 'var' ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) ( '=' ( (lv_default_4_0= ruleValue ) ) )? )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:221:3: 'var' ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) ( '=' ( (lv_default_4_0= ruleValue ) ) )?
            {
            match(input,10,FOLLOW_10_in_ruleDeclaredProperty296); 

                    createLeafNode(grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:225:1: ( ( ruleFQN ) )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:226:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:226:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:227:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDeclaredPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleDeclaredProperty319);
                    ruleFQN();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:241:3: ( (lv_name_2_0= ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:242:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:242:1: (lv_name_2_0= ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:243:3: lv_name_2_0= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleDeclaredProperty341);
            lv_name_2_0=ruleFQN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclaredPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"FQN", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:265:2: ( '=' ( (lv_default_4_0= ruleValue ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:265:4: '=' ( (lv_default_4_0= ruleValue ) )
                    {
                    match(input,11,FOLLOW_11_in_ruleDeclaredProperty352); 

                            createLeafNode(grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0(), null); 
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:269:1: ( (lv_default_4_0= ruleValue ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:270:1: (lv_default_4_0= ruleValue )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:270:1: (lv_default_4_0= ruleValue )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:271:3: lv_default_4_0= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleDeclaredProperty373);
                    lv_default_4_0=ruleValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDeclaredPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"default",
                    	        		lv_default_4_0, 
                    	        		"Value", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDeclaredProperty


    // $ANTLR start entryRuleRootComponent
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:301:1: entryRuleRootComponent returns [EObject current=null] : iv_ruleRootComponent= ruleRootComponent EOF ;
    public final EObject entryRuleRootComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootComponent = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:302:2: (iv_ruleRootComponent= ruleRootComponent EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:303:2: iv_ruleRootComponent= ruleRootComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRootComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleRootComponent_in_entryRuleRootComponent411);
            iv_ruleRootComponent=ruleRootComponent();
            _fsp--;

             current =iv_ruleRootComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootComponent421); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRootComponent


    // $ANTLR start ruleRootComponent
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:310:1: ruleRootComponent returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) ) ( ':' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}' ) ;
    public final EObject ruleRootComponent() throws RecognitionException {
        EObject current = null;

        Token lv_autoInject_6_0=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_assignment_8_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:315:6: ( ( () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) ) ( ':' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}' ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:316:1: ( () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) ) ( ':' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}' )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:316:1: ( () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) ) ( ':' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:316:2: () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) ) ( ':' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}'
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:316:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:317:5: 
            {
             
                    temp=factory.create(grammarAccess.getRootComponentAccess().getComponentAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRootComponentAccess().getComponentAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:327:2: ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("327:2: ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:327:3: ( ( ruleFQN ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:327:3: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:328:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:328:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:329:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getRootComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleRootComponent479);
                    ruleFQN();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:344:6: ( '@' ( ( ruleFQN ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:344:6: ( '@' ( ( ruleFQN ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:344:8: '@' ( ( ruleFQN ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleRootComponent496); 

                            createLeafNode(grammarAccess.getRootComponentAccess().getCommercialAtKeyword_1_1_0(), null); 
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:348:1: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:349:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:349:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:350:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getRootComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleRootComponent519);
                    ruleFQN();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:364:4: ( ':' ( (lv_name_5_0= ruleFQN ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:364:6: ':' ( (lv_name_5_0= ruleFQN ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleRootComponent532); 

                            createLeafNode(grammarAccess.getRootComponentAccess().getColonKeyword_2_0(), null); 
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:368:1: ( (lv_name_5_0= ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:369:1: (lv_name_5_0= ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:369:1: (lv_name_5_0= ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:370:3: lv_name_5_0= ruleFQN
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRootComponentAccess().getNameFQNParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleRootComponent553);
                    lv_name_5_0=ruleFQN();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRootComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_5_0, 
                    	        		"FQN", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:392:4: ( (lv_autoInject_6_0= 'auto-inject' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:393:1: (lv_autoInject_6_0= 'auto-inject' )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:393:1: (lv_autoInject_6_0= 'auto-inject' )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:394:3: lv_autoInject_6_0= 'auto-inject'
                    {
                    lv_autoInject_6_0=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleRootComponent573); 

                            createLeafNode(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0(), "autoInject"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRootComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "autoInject", true, "auto-inject", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleRootComponent597); 

                    createLeafNode(grammarAccess.getRootComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:417:1: ( (lv_assignment_8_0= ruleAssignment ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:418:1: (lv_assignment_8_0= ruleAssignment )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:418:1: (lv_assignment_8_0= ruleAssignment )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:419:3: lv_assignment_8_0= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRootComponentAccess().getAssignmentAssignmentParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleRootComponent618);
            	    lv_assignment_8_0=ruleAssignment();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRootComponentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"assignment",
            	    	        		lv_assignment_8_0, 
            	    	        		"Assignment", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleRootComponent629); 

                    createLeafNode(grammarAccess.getRootComponentAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRootComponent


    // $ANTLR start entryRuleComponent
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:453:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:454:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:455:2: iv_ruleComponent= ruleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent665);
            iv_ruleComponent=ruleComponent();
            _fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent675); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComponent


    // $ANTLR start ruleComponent
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:462:1: ruleComponent returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )? ( ':' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_autoInject_6_0=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_assignment_8_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:467:6: ( ( () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )? ( ':' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}' ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:468:1: ( () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )? ( ':' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}' )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:468:1: ( () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )? ( ':' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:468:2: () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )? ( ':' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}'
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:468:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:469:5: 
            {
             
                    temp=factory.create(grammarAccess.getComponentAccess().getComponentAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getComponentAccess().getComponentAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:479:2: ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:479:3: ( ( ruleFQN ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:479:3: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:480:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:480:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:481:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent733);
                    ruleFQN();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:496:6: ( '@' ( ( ruleFQN ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:496:6: ( '@' ( ( ruleFQN ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:496:8: '@' ( ( ruleFQN ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleComponent750); 

                            createLeafNode(grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0(), null); 
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:500:1: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:501:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:501:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:502:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent773);
                    ruleFQN();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:516:5: ( ':' ( (lv_name_5_0= ruleFQN ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:516:7: ':' ( (lv_name_5_0= ruleFQN ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleComponent787); 

                            createLeafNode(grammarAccess.getComponentAccess().getColonKeyword_2_0(), null); 
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:520:1: ( (lv_name_5_0= ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:521:1: (lv_name_5_0= ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:521:1: (lv_name_5_0= ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:522:3: lv_name_5_0= ruleFQN
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent808);
                    lv_name_5_0=ruleFQN();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_5_0, 
                    	        		"FQN", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:544:4: ( (lv_autoInject_6_0= 'auto-inject' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:545:1: (lv_autoInject_6_0= 'auto-inject' )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:545:1: (lv_autoInject_6_0= 'auto-inject' )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:546:3: lv_autoInject_6_0= 'auto-inject'
                    {
                    lv_autoInject_6_0=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleComponent828); 

                            createLeafNode(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0(), "autoInject"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "autoInject", true, "auto-inject", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleComponent852); 

                    createLeafNode(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:569:1: ( (lv_assignment_8_0= ruleAssignment ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:570:1: (lv_assignment_8_0= ruleAssignment )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:570:1: (lv_assignment_8_0= ruleAssignment )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:571:3: lv_assignment_8_0= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleComponent873);
            	    lv_assignment_8_0=ruleAssignment();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"assignment",
            	    	        		lv_assignment_8_0, 
            	    	        		"Assignment", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleComponent884); 

                    createLeafNode(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComponent


    // $ANTLR start entryRuleImport
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:605:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:606:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:607:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport920);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport930); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:614:1: ruleImport returns [EObject current=null] : ( 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:619:6: ( ( 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:620:1: ( 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:620:1: ( 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:620:3: 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            {
            match(input,17,FOLLOW_17_in_ruleImport965); 

                    createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:624:1: ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:625:1: (lv_importedNamespace_1_0= ruleImportedFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:625:1: (lv_importedNamespace_1_0= ruleImportedFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:626:3: lv_importedNamespace_1_0= ruleImportedFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleImportedFQN_in_ruleImport986);
            lv_importedNamespace_1_0=ruleImportedFQN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importedNamespace",
            	        		lv_importedNamespace_1_0, 
            	        		"ImportedFQN", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleImportedFQN
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:656:1: entryRuleImportedFQN returns [String current=null] : iv_ruleImportedFQN= ruleImportedFQN EOF ;
    public final String entryRuleImportedFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportedFQN = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:657:2: (iv_ruleImportedFQN= ruleImportedFQN EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:658:2: iv_ruleImportedFQN= ruleImportedFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportedFQNRule(), currentNode); 
            pushFollow(FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN1023);
            iv_ruleImportedFQN=ruleImportedFQN();
            _fsp--;

             current =iv_ruleImportedFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedFQN1034); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImportedFQN


    // $ANTLR start ruleImportedFQN
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:665:1: ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleImportedFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:670:6: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:671:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:671:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:672:5: this_FQN_0= ruleFQN (kw= '.*' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleImportedFQN1081);
            this_FQN_0=ruleFQN();
            _fsp--;


            		current.merge(this_FQN_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:682:1: (kw= '.*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:683:2: kw= '.*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleImportedFQN1100); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImportedFQN


    // $ANTLR start entryRuleAssignment
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:696:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:697:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:698:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1142);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1152); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:705:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:710:6: ( ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:711:1: ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:711:1: ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:711:2: ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:711:2: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:712:1: ( RULE_ID )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:712:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:713:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1195); 

            		createLeafNode(grammarAccess.getAssignmentAccess().getFeatureJvmFeatureCrossReference_0_0(), "feature"); 
            	

            }


            }

            match(input,11,FOLLOW_11_in_ruleAssignment1205); 

                    createLeafNode(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:729:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:730:1: (lv_value_2_0= ruleValue )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:730:1: (lv_value_2_0= ruleValue )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:731:3: lv_value_2_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment1226);
            lv_value_2_0=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_2_0, 
            	        		"Value", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleValue
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:761:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:762:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:763:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1262);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1272); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValue


    // $ANTLR start ruleValue
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:770:1: ruleValue returns [EObject current=null] : (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;

        EObject this_Reference_3 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:775:6: ( (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:776:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:776:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||LA14_1==RULE_ID||LA14_1==10||LA14_1==12||LA14_1==16) ) {
                    alt14=4;
                }
                else if ( ((LA14_1>=13 && LA14_1<=15)||LA14_1==21) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("776:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                {
                alt14=1;
                }
                break;
            case 23:
            case 24:
                {
                alt14=2;
                }
                break;
            case 19:
            case 20:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("776:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:777:5: this_Component_0= ruleComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getComponentParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleComponent_in_ruleValue1319);
                    this_Component_0=ruleComponent();
                    _fsp--;

                     
                            current = this_Component_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:787:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleValue1346);
                    this_StringLiteral_1=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:797:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleValue1373);
                    this_BooleanLiteral_2=ruleBooleanLiteral();
                    _fsp--;

                     
                            current = this_BooleanLiteral_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:807:5: this_Reference_3= ruleReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getReferenceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleValue1400);
                    this_Reference_3=ruleReference();
                    _fsp--;

                     
                            current = this_Reference_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValue


    // $ANTLR start entryRuleStringLiteral
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:823:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:824:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:825:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1435);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:832:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleCompoundString ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:837:6: ( ( (lv_value_0_0= ruleCompoundString ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:838:1: ( (lv_value_0_0= ruleCompoundString ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:838:1: ( (lv_value_0_0= ruleCompoundString ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:839:1: (lv_value_0_0= ruleCompoundString )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:839:1: (lv_value_0_0= ruleCompoundString )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:840:3: lv_value_0_0= ruleCompoundString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStringLiteralAccess().getValueCompoundStringParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompoundString_in_ruleStringLiteral1490);
            lv_value_0_0=ruleCompoundString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"CompoundString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleBooleanLiteral
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:870:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:871:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:872:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1525);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();
            _fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1535); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanLiteral


    // $ANTLR start ruleBooleanLiteral
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:879:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_isTrue_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:884:6: ( ( () ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:885:1: ( () ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:885:1: ( () ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:885:2: () ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:885:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:886:5: 
            {
             
                    temp=factory.create(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:896:2: ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            else if ( (LA15_0==20) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("896:2: ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:896:3: ( (lv_isTrue_1_0= 'true' ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:896:3: ( (lv_isTrue_1_0= 'true' ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:897:1: (lv_isTrue_1_0= 'true' )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:897:1: (lv_isTrue_1_0= 'true' )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:898:3: lv_isTrue_1_0= 'true'
                    {
                    lv_isTrue_1_0=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleBooleanLiteral1588); 

                            createLeafNode(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0(), "isTrue"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBooleanLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isTrue", true, "true", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:918:7: 'false'
                    {
                    match(input,20,FOLLOW_20_in_ruleBooleanLiteral1617); 

                            createLeafNode(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanLiteral


    // $ANTLR start entryRuleReference
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:930:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:931:2: (iv_ruleReference= ruleReference EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:932:2: iv_ruleReference= ruleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1654);
            iv_ruleReference=ruleReference();
            _fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1664); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReference


    // $ANTLR start ruleReference
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:939:1: ruleReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:944:6: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:945:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:945:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:946:1: ( RULE_ID )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:946:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:947:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1706); 

            		createLeafNode(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0(), "referable"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReference


    // $ANTLR start entryRuleFQN
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:967:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:968:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:969:2: iv_ruleFQN= ruleFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1742);
            iv_ruleFQN=ruleFQN();
            _fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1753); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFQN


    // $ANTLR start ruleFQN
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:976:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:981:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:982:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:982:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:982:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1793); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:989:1: (kw= '.' this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:990:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,21,FOLLOW_21_in_ruleFQN1812); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1827); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFQN


    // $ANTLR start entryRuleCompoundString
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1010:1: entryRuleCompoundString returns [EObject current=null] : iv_ruleCompoundString= ruleCompoundString EOF ;
    public final EObject entryRuleCompoundString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundString = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1014:2: (iv_ruleCompoundString= ruleCompoundString EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1015:2: iv_ruleCompoundString= ruleCompoundString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundStringRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundString_in_entryRuleCompoundString1880);
            iv_ruleCompoundString=ruleCompoundString();
            _fsp--;

             current =iv_ruleCompoundString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundString1890); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleCompoundString


    // $ANTLR start ruleCompoundString
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1025:1: ruleCompoundString returns [EObject current=null] : ( ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) ) ) ;
    public final EObject ruleCompoundString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_begin_0_0 = null;

        EObject lv_parts_1_0 = null;

        AntlrDatatypeRuleToken lv_end_2_0 = null;

        AntlrDatatypeRuleToken lv_begin_3_0 = null;

        EObject lv_parts_4_0 = null;

        AntlrDatatypeRuleToken lv_end_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1031:6: ( ( ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1032:1: ( ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1032:1: ( ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            else if ( (LA19_0==24) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1032:1: ( ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) ) )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1032:2: ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1032:2: ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1032:3: ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1032:3: ( (lv_begin_0_0= ruleSingleQuote ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1033:1: (lv_begin_0_0= ruleSingleQuote )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1033:1: (lv_begin_0_0= ruleSingleQuote )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1034:3: lv_begin_0_0= ruleSingleQuote
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompoundStringAccess().getBeginSingleQuoteParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSingleQuote_in_ruleCompoundString1941);
                    lv_begin_0_0=ruleSingleQuote();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompoundStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"begin",
                    	        		lv_begin_0_0, 
                    	        		"SingleQuote", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1056:2: ( (lv_parts_1_0= ruleStringPart ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=RULE_ID && LA17_0<=17)||(LA17_0>=19 && LA17_0<=22)||LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1057:1: (lv_parts_1_0= ruleStringPart )
                    	    {
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1057:1: (lv_parts_1_0= ruleStringPart )
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1058:3: lv_parts_1_0= ruleStringPart
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompoundStringAccess().getPartsStringPartParserRuleCall_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStringPart_in_ruleCompoundString1962);
                    	    lv_parts_1_0=ruleStringPart();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCompoundStringRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"parts",
                    	    	        		lv_parts_1_0, 
                    	    	        		"StringPart", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1080:3: ( (lv_end_2_0= ruleSingleQuote ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1081:1: (lv_end_2_0= ruleSingleQuote )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1081:1: (lv_end_2_0= ruleSingleQuote )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1082:3: lv_end_2_0= ruleSingleQuote
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompoundStringAccess().getEndSingleQuoteParserRuleCall_0_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSingleQuote_in_ruleCompoundString1984);
                    lv_end_2_0=ruleSingleQuote();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompoundStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"end",
                    	        		lv_end_2_0, 
                    	        		"SingleQuote", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1105:6: ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1105:6: ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1105:7: ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1105:7: ( (lv_begin_3_0= ruleDoubleQuote ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1106:1: (lv_begin_3_0= ruleDoubleQuote )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1106:1: (lv_begin_3_0= ruleDoubleQuote )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1107:3: lv_begin_3_0= ruleDoubleQuote
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompoundStringAccess().getBeginDoubleQuoteParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDoubleQuote_in_ruleCompoundString2013);
                    lv_begin_3_0=ruleDoubleQuote();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompoundStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"begin",
                    	        		lv_begin_3_0, 
                    	        		"DoubleQuote", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1129:2: ( (lv_parts_4_0= ruleStringPart ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=RULE_ID && LA18_0<=17)||(LA18_0>=19 && LA18_0<=22)||LA18_0==25) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1130:1: (lv_parts_4_0= ruleStringPart )
                    	    {
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1130:1: (lv_parts_4_0= ruleStringPart )
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1131:3: lv_parts_4_0= ruleStringPart
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompoundStringAccess().getPartsStringPartParserRuleCall_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStringPart_in_ruleCompoundString2034);
                    	    lv_parts_4_0=ruleStringPart();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCompoundStringRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"parts",
                    	    	        		lv_parts_4_0, 
                    	    	        		"StringPart", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1153:3: ( (lv_end_5_0= ruleDoubleQuote ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1154:1: (lv_end_5_0= ruleDoubleQuote )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1154:1: (lv_end_5_0= ruleDoubleQuote )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1155:3: lv_end_5_0= ruleDoubleQuote
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompoundStringAccess().getEndDoubleQuoteParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDoubleQuote_in_ruleCompoundString2056);
                    lv_end_5_0=ruleDoubleQuote();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompoundStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"end",
                    	        		lv_end_5_0, 
                    	        		"DoubleQuote", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleCompoundString


    // $ANTLR start entryRuleStringPart
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1188:1: entryRuleStringPart returns [EObject current=null] : iv_ruleStringPart= ruleStringPart EOF ;
    public final EObject entryRuleStringPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPart = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1189:2: (iv_ruleStringPart= ruleStringPart EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1190:2: iv_ruleStringPart= ruleStringPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringPart_in_entryRuleStringPart2097);
            iv_ruleStringPart=ruleStringPart();
            _fsp--;

             current =iv_ruleStringPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringPart2107); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringPart


    // $ANTLR start ruleStringPart
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1197:1: ruleStringPart returns [EObject current=null] : (this_PropertyReference_0= rulePropertyReference | this_PlainString_1= rulePlainString ) ;
    public final EObject ruleStringPart() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyReference_0 = null;

        EObject this_PlainString_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1202:6: ( (this_PropertyReference_0= rulePropertyReference | this_PlainString_1= rulePlainString ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1203:1: (this_PropertyReference_0= rulePropertyReference | this_PlainString_1= rulePlainString )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1203:1: (this_PropertyReference_0= rulePropertyReference | this_PlainString_1= rulePlainString )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_ID && LA20_0<=17)||(LA20_0>=19 && LA20_0<=21)||LA20_0==25) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1203:1: (this_PropertyReference_0= rulePropertyReference | this_PlainString_1= rulePlainString )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1204:5: this_PropertyReference_0= rulePropertyReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStringPartAccess().getPropertyReferenceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePropertyReference_in_ruleStringPart2154);
                    this_PropertyReference_0=rulePropertyReference();
                    _fsp--;

                     
                            current = this_PropertyReference_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1214:5: this_PlainString_1= rulePlainString
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStringPartAccess().getPlainStringParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePlainString_in_ruleStringPart2181);
                    this_PlainString_1=rulePlainString();
                    _fsp--;

                     
                            current = this_PlainString_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringPart


    // $ANTLR start entryRulePropertyReference
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1230:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1231:2: (iv_rulePropertyReference= rulePropertyReference EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1232:2: iv_rulePropertyReference= rulePropertyReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyReferenceRule(), currentNode); 
            pushFollow(FOLLOW_rulePropertyReference_in_entryRulePropertyReference2216);
            iv_rulePropertyReference=rulePropertyReference();
            _fsp--;

             current =iv_rulePropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReference2226); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePropertyReference


    // $ANTLR start rulePropertyReference
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1239:1: rulePropertyReference returns [EObject current=null] : ( '${' ( ( RULE_ID ) ) '}' ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1244:6: ( ( '${' ( ( RULE_ID ) ) '}' ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1245:1: ( '${' ( ( RULE_ID ) ) '}' )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1245:1: ( '${' ( ( RULE_ID ) ) '}' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1245:3: '${' ( ( RULE_ID ) ) '}'
            {
            match(input,22,FOLLOW_22_in_rulePropertyReference2261); 

                    createLeafNode(grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1249:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1250:1: ( RULE_ID )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1250:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1251:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyReference2279); 

            		createLeafNode(grammarAccess.getPropertyReferenceAccess().getPropertyDeclaredPropertyCrossReference_1_0(), "property"); 
            	

            }


            }

            match(input,16,FOLLOW_16_in_rulePropertyReference2289); 

                    createLeafNode(grammarAccess.getPropertyReferenceAccess().getRightCurlyBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePropertyReference


    // $ANTLR start entryRulePlainString
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1275:1: entryRulePlainString returns [EObject current=null] : iv_rulePlainString= rulePlainString EOF ;
    public final EObject entryRulePlainString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainString = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1276:2: (iv_rulePlainString= rulePlainString EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1277:2: iv_rulePlainString= rulePlainString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPlainStringRule(), currentNode); 
            pushFollow(FOLLOW_rulePlainString_in_entryRulePlainString2325);
            iv_rulePlainString=rulePlainString();
            _fsp--;

             current =iv_rulePlainString; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlainString2335); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePlainString


    // $ANTLR start rulePlainString
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1284:1: rulePlainString returns [EObject current=null] : ( (lv_value_0_0= ruleConstantValue ) ) ;
    public final EObject rulePlainString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1289:6: ( ( (lv_value_0_0= ruleConstantValue ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1290:1: ( (lv_value_0_0= ruleConstantValue ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1290:1: ( (lv_value_0_0= ruleConstantValue ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1291:1: (lv_value_0_0= ruleConstantValue )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1291:1: (lv_value_0_0= ruleConstantValue )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1292:3: lv_value_0_0= ruleConstantValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstantValue_in_rulePlainString2380);
            lv_value_0_0=ruleConstantValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPlainStringRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"ConstantValue", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePlainString


    // $ANTLR start entryRuleConstantValue
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1322:1: entryRuleConstantValue returns [String current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final String entryRuleConstantValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantValue = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1323:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1324:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue2416);
            iv_ruleConstantValue=ruleConstantValue();
            _fsp--;

             current =iv_ruleConstantValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue2427); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstantValue


    // $ANTLR start ruleConstantValue
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1331:1: ruleConstantValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ML_COMMENT_2= RULE_ML_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT | this_ID_4= RULE_ID | kw= ':' | kw= '{' | kw= '}' | kw= '@' | this_EscapedDoubleQuote_9= ruleEscapedDoubleQuote | this_EscapedSingleQuote_10= ruleEscapedSingleQuote | this_EscapedBackslash_11= ruleEscapedBackslash | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | kw= 'module' | kw= 'auto-inject' | kw= 'var' | kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleConstantValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_ML_COMMENT_2=null;
        Token this_SL_COMMENT_3=null;
        Token this_ID_4=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_EscapedDoubleQuote_9 = null;

        AntlrDatatypeRuleToken this_EscapedSingleQuote_10 = null;

        AntlrDatatypeRuleToken this_EscapedBackslash_11 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1336:6: ( (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ML_COMMENT_2= RULE_ML_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT | this_ID_4= RULE_ID | kw= ':' | kw= '{' | kw= '}' | kw= '@' | this_EscapedDoubleQuote_9= ruleEscapedDoubleQuote | this_EscapedSingleQuote_10= ruleEscapedSingleQuote | this_EscapedBackslash_11= ruleEscapedBackslash | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | kw= 'module' | kw= 'auto-inject' | kw= 'var' | kw= '.' ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1337:1: (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ML_COMMENT_2= RULE_ML_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT | this_ID_4= RULE_ID | kw= ':' | kw= '{' | kw= '}' | kw= '@' | this_EscapedDoubleQuote_9= ruleEscapedDoubleQuote | this_EscapedSingleQuote_10= ruleEscapedSingleQuote | this_EscapedBackslash_11= ruleEscapedBackslash | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | kw= 'module' | kw= 'auto-inject' | kw= 'var' | kw= '.' )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1337:1: (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ML_COMMENT_2= RULE_ML_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT | this_ID_4= RULE_ID | kw= ':' | kw= '{' | kw= '}' | kw= '@' | this_EscapedDoubleQuote_9= ruleEscapedDoubleQuote | this_EscapedSingleQuote_10= ruleEscapedSingleQuote | this_EscapedBackslash_11= ruleEscapedBackslash | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | kw= 'module' | kw= 'auto-inject' | kw= 'var' | kw= '.' )
            int alt21=20;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt21=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt21=2;
                }
                break;
            case RULE_ML_COMMENT:
                {
                alt21=3;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt21=4;
                }
                break;
            case RULE_ID:
                {
                alt21=5;
                }
                break;
            case 13:
                {
                alt21=6;
                }
                break;
            case 15:
                {
                alt21=7;
                }
                break;
            case 16:
                {
                alt21=8;
                }
                break;
            case 12:
                {
                alt21=9;
                }
                break;
            case 25:
                {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt21=12;
                    }
                    break;
                case 23:
                    {
                    alt21=11;
                    }
                    break;
                case 24:
                    {
                    alt21=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1337:1: (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ML_COMMENT_2= RULE_ML_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT | this_ID_4= RULE_ID | kw= ':' | kw= '{' | kw= '}' | kw= '@' | this_EscapedDoubleQuote_9= ruleEscapedDoubleQuote | this_EscapedSingleQuote_10= ruleEscapedSingleQuote | this_EscapedBackslash_11= ruleEscapedBackslash | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | kw= 'module' | kw= 'auto-inject' | kw= 'var' | kw= '.' )", 21, 10, input);

                    throw nvae;
                }

                }
                break;
            case 19:
                {
                alt21=13;
                }
                break;
            case 20:
                {
                alt21=14;
                }
                break;
            case 11:
                {
                alt21=15;
                }
                break;
            case 17:
                {
                alt21=16;
                }
                break;
            case 9:
                {
                alt21=17;
                }
                break;
            case 14:
                {
                alt21=18;
                }
                break;
            case 10:
                {
                alt21=19;
                }
                break;
            case 21:
                {
                alt21=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1337:1: (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ML_COMMENT_2= RULE_ML_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT | this_ID_4= RULE_ID | kw= ':' | kw= '{' | kw= '}' | kw= '@' | this_EscapedDoubleQuote_9= ruleEscapedDoubleQuote | this_EscapedSingleQuote_10= ruleEscapedSingleQuote | this_EscapedBackslash_11= ruleEscapedBackslash | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | kw= 'module' | kw= 'auto-inject' | kw= 'var' | kw= '.' )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1337:6: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)input.LT(1);
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleConstantValue2467); 

                    		current.merge(this_WS_0);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1345:10: this_ANY_OTHER_1= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_1=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleConstantValue2493); 

                    		current.merge(this_ANY_OTHER_1);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1353:10: this_ML_COMMENT_2= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_2=(Token)input.LT(1);
                    match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleConstantValue2519); 

                    		current.merge(this_ML_COMMENT_2);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getML_COMMENTTerminalRuleCall_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1361:10: this_SL_COMMENT_3= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_3=(Token)input.LT(1);
                    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleConstantValue2545); 

                    		current.merge(this_SL_COMMENT_3);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getSL_COMMENTTerminalRuleCall_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1369:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantValue2571); 

                    		current.merge(this_ID_4);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1378:2: kw= ':'
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleConstantValue2595); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getColonKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1385:2: kw= '{'
                    {
                    kw=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleConstantValue2614); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getLeftCurlyBracketKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1392:2: kw= '}'
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleConstantValue2633); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getRightCurlyBracketKeyword_7(), null); 
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1399:2: kw= '@'
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleConstantValue2652); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getCommercialAtKeyword_8(), null); 
                        

                    }
                    break;
                case 10 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1406:5: this_EscapedDoubleQuote_9= ruleEscapedDoubleQuote
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getEscapedDoubleQuoteParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEscapedDoubleQuote_in_ruleConstantValue2680);
                    this_EscapedDoubleQuote_9=ruleEscapedDoubleQuote();
                    _fsp--;


                    		current.merge(this_EscapedDoubleQuote_9);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1418:5: this_EscapedSingleQuote_10= ruleEscapedSingleQuote
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getEscapedSingleQuoteParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEscapedSingleQuote_in_ruleConstantValue2713);
                    this_EscapedSingleQuote_10=ruleEscapedSingleQuote();
                    _fsp--;


                    		current.merge(this_EscapedSingleQuote_10);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1430:5: this_EscapedBackslash_11= ruleEscapedBackslash
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getEscapedBackslashParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEscapedBackslash_in_ruleConstantValue2746);
                    this_EscapedBackslash_11=ruleEscapedBackslash();
                    _fsp--;


                    		current.merge(this_EscapedBackslash_11);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 13 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1442:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleConstantValue2770); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getTrueKeyword_12(), null); 
                        

                    }
                    break;
                case 14 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1449:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleConstantValue2789); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getFalseKeyword_13(), null); 
                        

                    }
                    break;
                case 15 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1456:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleConstantValue2808); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getEqualsSignKeyword_14(), null); 
                        

                    }
                    break;
                case 16 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1463:2: kw= 'import'
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleConstantValue2827); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getImportKeyword_15(), null); 
                        

                    }
                    break;
                case 17 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1470:2: kw= 'module'
                    {
                    kw=(Token)input.LT(1);
                    match(input,9,FOLLOW_9_in_ruleConstantValue2846); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getModuleKeyword_16(), null); 
                        

                    }
                    break;
                case 18 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1477:2: kw= 'auto-inject'
                    {
                    kw=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleConstantValue2865); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getAutoInjectKeyword_17(), null); 
                        

                    }
                    break;
                case 19 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1484:2: kw= 'var'
                    {
                    kw=(Token)input.LT(1);
                    match(input,10,FOLLOW_10_in_ruleConstantValue2884); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getVarKeyword_18(), null); 
                        

                    }
                    break;
                case 20 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1491:2: kw= '.'
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleConstantValue2903); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getFullStopKeyword_19(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstantValue


    // $ANTLR start entryRuleSingleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1504:1: entryRuleSingleQuote returns [String current=null] : iv_ruleSingleQuote= ruleSingleQuote EOF ;
    public final String entryRuleSingleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSingleQuote = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1505:2: (iv_ruleSingleQuote= ruleSingleQuote EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1506:2: iv_ruleSingleQuote= ruleSingleQuote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSingleQuoteRule(), currentNode); 
            pushFollow(FOLLOW_ruleSingleQuote_in_entryRuleSingleQuote2944);
            iv_ruleSingleQuote=ruleSingleQuote();
            _fsp--;

             current =iv_ruleSingleQuote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleQuote2955); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSingleQuote


    // $ANTLR start ruleSingleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1513:1: ruleSingleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\'' ;
    public final AntlrDatatypeRuleToken ruleSingleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1518:6: (kw= '\\'' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1520:2: kw= '\\''
            {
            kw=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_ruleSingleQuote2992); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getSingleQuoteAccess().getApostropheKeyword(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSingleQuote


    // $ANTLR start entryRuleEscapedSingleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1533:1: entryRuleEscapedSingleQuote returns [String current=null] : iv_ruleEscapedSingleQuote= ruleEscapedSingleQuote EOF ;
    public final String entryRuleEscapedSingleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEscapedSingleQuote = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1537:2: (iv_ruleEscapedSingleQuote= ruleEscapedSingleQuote EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1538:2: iv_ruleEscapedSingleQuote= ruleEscapedSingleQuote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEscapedSingleQuoteRule(), currentNode); 
            pushFollow(FOLLOW_ruleEscapedSingleQuote_in_entryRuleEscapedSingleQuote3038);
            iv_ruleEscapedSingleQuote=ruleEscapedSingleQuote();
            _fsp--;

             current =iv_ruleEscapedSingleQuote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedSingleQuote3049); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleEscapedSingleQuote


    // $ANTLR start ruleEscapedSingleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1548:1: ruleEscapedSingleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote ) ;
    public final AntlrDatatypeRuleToken ruleEscapedSingleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Backslash_0 = null;

        AntlrDatatypeRuleToken this_SingleQuote_1 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1554:6: ( (this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1555:1: (this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1555:1: (this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1556:5: this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedSingleQuoteAccess().getBackslashParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBackslash_in_ruleEscapedSingleQuote3100);
            this_Backslash_0=ruleBackslash();
            _fsp--;


            		current.merge(this_Backslash_0);
                
             
                    currentNode = currentNode.getParent();
                
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedSingleQuoteAccess().getSingleQuoteParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleSingleQuote_in_ruleEscapedSingleQuote3127);
            this_SingleQuote_1=ruleSingleQuote();
            _fsp--;


            		current.merge(this_SingleQuote_1);
                
             
                    currentNode = currentNode.getParent();
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleEscapedSingleQuote


    // $ANTLR start entryRuleDoubleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1588:1: entryRuleDoubleQuote returns [String current=null] : iv_ruleDoubleQuote= ruleDoubleQuote EOF ;
    public final String entryRuleDoubleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDoubleQuote = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1589:2: (iv_ruleDoubleQuote= ruleDoubleQuote EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1590:2: iv_ruleDoubleQuote= ruleDoubleQuote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoubleQuoteRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_entryRuleDoubleQuote3177);
            iv_ruleDoubleQuote=ruleDoubleQuote();
            _fsp--;

             current =iv_ruleDoubleQuote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleQuote3188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDoubleQuote


    // $ANTLR start ruleDoubleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1597:1: ruleDoubleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\"' ;
    public final AntlrDatatypeRuleToken ruleDoubleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1602:6: (kw= '\"' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1604:2: kw= '\"'
            {
            kw=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_ruleDoubleQuote3225); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getDoubleQuoteAccess().getQuotationMarkKeyword(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDoubleQuote


    // $ANTLR start entryRuleEscapedDoubleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1617:1: entryRuleEscapedDoubleQuote returns [String current=null] : iv_ruleEscapedDoubleQuote= ruleEscapedDoubleQuote EOF ;
    public final String entryRuleEscapedDoubleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEscapedDoubleQuote = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1621:2: (iv_ruleEscapedDoubleQuote= ruleEscapedDoubleQuote EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1622:2: iv_ruleEscapedDoubleQuote= ruleEscapedDoubleQuote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEscapedDoubleQuoteRule(), currentNode); 
            pushFollow(FOLLOW_ruleEscapedDoubleQuote_in_entryRuleEscapedDoubleQuote3271);
            iv_ruleEscapedDoubleQuote=ruleEscapedDoubleQuote();
            _fsp--;

             current =iv_ruleEscapedDoubleQuote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedDoubleQuote3282); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleEscapedDoubleQuote


    // $ANTLR start ruleEscapedDoubleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1632:1: ruleEscapedDoubleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote ) ;
    public final AntlrDatatypeRuleToken ruleEscapedDoubleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Backslash_0 = null;

        AntlrDatatypeRuleToken this_DoubleQuote_1 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1638:6: ( (this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1639:1: (this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1639:1: (this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1640:5: this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedDoubleQuoteAccess().getBackslashParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBackslash_in_ruleEscapedDoubleQuote3333);
            this_Backslash_0=ruleBackslash();
            _fsp--;


            		current.merge(this_Backslash_0);
                
             
                    currentNode = currentNode.getParent();
                
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedDoubleQuoteAccess().getDoubleQuoteParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleDoubleQuote_in_ruleEscapedDoubleQuote3360);
            this_DoubleQuote_1=ruleDoubleQuote();
            _fsp--;


            		current.merge(this_DoubleQuote_1);
                
             
                    currentNode = currentNode.getParent();
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleEscapedDoubleQuote


    // $ANTLR start entryRuleBackslash
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1672:1: entryRuleBackslash returns [String current=null] : iv_ruleBackslash= ruleBackslash EOF ;
    public final String entryRuleBackslash() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBackslash = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1673:2: (iv_ruleBackslash= ruleBackslash EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1674:2: iv_ruleBackslash= ruleBackslash EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBackslashRule(), currentNode); 
            pushFollow(FOLLOW_ruleBackslash_in_entryRuleBackslash3410);
            iv_ruleBackslash=ruleBackslash();
            _fsp--;

             current =iv_ruleBackslash.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackslash3421); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBackslash


    // $ANTLR start ruleBackslash
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1681:1: ruleBackslash returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\\\' ;
    public final AntlrDatatypeRuleToken ruleBackslash() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1686:6: (kw= '\\\\' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1688:2: kw= '\\\\'
            {
            kw=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ruleBackslash3458); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getBackslashAccess().getReverseSolidusKeyword(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBackslash


    // $ANTLR start entryRuleEscapedBackslash
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1701:1: entryRuleEscapedBackslash returns [String current=null] : iv_ruleEscapedBackslash= ruleEscapedBackslash EOF ;
    public final String entryRuleEscapedBackslash() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEscapedBackslash = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1705:2: (iv_ruleEscapedBackslash= ruleEscapedBackslash EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1706:2: iv_ruleEscapedBackslash= ruleEscapedBackslash EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEscapedBackslashRule(), currentNode); 
            pushFollow(FOLLOW_ruleEscapedBackslash_in_entryRuleEscapedBackslash3504);
            iv_ruleEscapedBackslash=ruleEscapedBackslash();
            _fsp--;

             current =iv_ruleEscapedBackslash.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedBackslash3515); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleEscapedBackslash


    // $ANTLR start ruleEscapedBackslash
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1716:1: ruleEscapedBackslash returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash ) ;
    public final AntlrDatatypeRuleToken ruleEscapedBackslash() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Backslash_0 = null;

        AntlrDatatypeRuleToken this_Backslash_1 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1722:6: ( (this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1723:1: (this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1723:1: (this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1724:5: this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBackslash_in_ruleEscapedBackslash3566);
            this_Backslash_0=ruleBackslash();
            _fsp--;


            		current.merge(this_Backslash_0);
                
             
                    currentNode = currentNode.getParent();
                
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleBackslash_in_ruleEscapedBackslash3593);
            this_Backslash_1=ruleBackslash();
            _fsp--;


            		current.merge(this_Backslash_1);
                
             
                    currentNode = currentNode.getParent();
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleEscapedBackslash


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\11\uffff";
    static final String DFA3_eofS =
        "\1\uffff\1\3\2\uffff\1\7\1\3\2\uffff\1\7";
    static final String DFA3_minS =
        "\3\4\1\uffff\3\4\1\uffff\1\4";
    static final String DFA3_maxS =
        "\1\4\1\25\1\4\1\uffff\2\25\1\4\1\uffff\1\25";
    static final String DFA3_acceptS =
        "\3\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String DFA3_specialS =
        "\11\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\4\5\uffff\3\3\10\uffff\1\2",
            "\1\5",
            "",
            "\1\7\5\uffff\3\7\3\3\5\uffff\1\6",
            "\1\4\5\uffff\3\3\10\uffff\1\2",
            "\1\10",
            "",
            "\1\7\5\uffff\3\7\3\3\5\uffff\1\6"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "225:1: ( ( ruleFQN ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleModule129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleModule150 = new BitSet(new long[]{0x0000000000021410L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModule171 = new BitSet(new long[]{0x0000000000021410L});
    public static final BitSet FOLLOW_ruleDeclaredProperty_in_ruleModule193 = new BitSet(new long[]{0x0000000000001410L});
    public static final BitSet FOLLOW_ruleRootComponent_in_ruleModule215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredProperty_in_entryRuleDeclaredProperty251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredProperty261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleDeclaredProperty296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDeclaredProperty319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDeclaredProperty341 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleDeclaredProperty352 = new BitSet(new long[]{0x000000000198F010L});
    public static final BitSet FOLLOW_ruleValue_in_ruleDeclaredProperty373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootComponent_in_entryRuleRootComponent411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootComponent421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleRootComponent479 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_12_in_ruleRootComponent496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleRootComponent519 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_13_in_ruleRootComponent532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleRootComponent553 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleRootComponent573 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRootComponent597 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleRootComponent618 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleRootComponent629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponent733 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_12_in_ruleComponent750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponent773 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_13_in_ruleComponent787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponent808 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleComponent828 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComponent852 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleComponent873 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleComponent884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImport965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_ruleImport986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedFQN1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImportedFQN1081 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleImportedFQN1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1195 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAssignment1205 = new BitSet(new long[]{0x000000000198F010L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignment1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleValue1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleValue1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleValue1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleValue1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundString_in_ruleStringLiteral1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBooleanLiteral1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBooleanLiteral1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1793 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleFQN1812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1827 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleCompoundString_in_entryRuleCompoundString1880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundString1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_ruleCompoundString1941 = new BitSet(new long[]{0x0000000002FBFFF0L});
    public static final BitSet FOLLOW_ruleStringPart_in_ruleCompoundString1962 = new BitSet(new long[]{0x0000000002FBFFF0L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_ruleCompoundString1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_ruleCompoundString2013 = new BitSet(new long[]{0x00000000037BFFF0L});
    public static final BitSet FOLLOW_ruleStringPart_in_ruleCompoundString2034 = new BitSet(new long[]{0x00000000037BFFF0L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_ruleCompoundString2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringPart_in_entryRuleStringPart2097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringPart2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_ruleStringPart2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_ruleStringPart2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_entryRulePropertyReference2216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReference2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePropertyReference2261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyReference2279 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePropertyReference2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_entryRulePlainString2325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlainString2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_rulePlainString2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue2416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleConstantValue2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleConstantValue2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleConstantValue2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleConstantValue2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantValue2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleConstantValue2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleConstantValue2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConstantValue2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleConstantValue2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedDoubleQuote_in_ruleConstantValue2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedSingleQuote_in_ruleConstantValue2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedBackslash_in_ruleConstantValue2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleConstantValue2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleConstantValue2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConstantValue2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleConstantValue2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleConstantValue2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleConstantValue2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleConstantValue2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleConstantValue2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_entryRuleSingleQuote2944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleQuote2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSingleQuote2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedSingleQuote_in_entryRuleEscapedSingleQuote3038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedSingleQuote3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_ruleEscapedSingleQuote3100 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_ruleEscapedSingleQuote3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_entryRuleDoubleQuote3177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleQuote3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDoubleQuote3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedDoubleQuote_in_entryRuleEscapedDoubleQuote3271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedDoubleQuote3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_ruleEscapedDoubleQuote3333 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_ruleEscapedDoubleQuote3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_entryRuleBackslash3410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackslash3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBackslash3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedBackslash_in_entryRuleEscapedBackslash3504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedBackslash3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_ruleEscapedBackslash3566 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleBackslash_in_ruleEscapedBackslash3593 = new BitSet(new long[]{0x0000000000000002L});

}