package constants;

import java.util.Arrays;
import java.util.List;

public class Constant {
    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT = 20;
        public static final int EXPLICIT_WAIT = 20;
    }

    public static class Urls {
        public static final String MAIN_PAGE_URL = "https://loansolution.com/";
        public static final String CONTACT_US_PAGE_URL = "https://loansolution.com/contact-us/";
        public static final String ORDER_PAGE_URL = "https://loansolution.com/order/?ref=loansolution-com";
        public static final String ORDER_REF_URL = "https://loansaccount.com/form/processing";
        public static final String PAYDAY_LOANS_URL = "https://loansolution.com/payday-loans/";
        public static final String BLOG_CATEGORY_URL = "https://loansolution.com/blog/";
    }

    public static class Header {
        public static final List<String> HEADER_TITLES = Arrays.asList(
                "Ohio Payday Loans Online",
                "Privacy Policy",
                "FAQ",
                "About Us",
                "Contact Us",
                "Reviews",
                "Apply Speedy Cash Loans"
        );
        public static final int NUMBER_OF_GOOD_HEADER_BUTTONS = 6;
    }

    public static class Footer {
        public static final List<String> FOOTER_TITLES = Arrays.asList(
                "Alabama",
                "Alaska",
                "Arizona",
                "Arkansas",
                "California"
        );
        public static final int NUMBER_OF_GOOD_FOOTER_BUTTONS = 28;
    }

    public static class Reviews {

        public static final List<String> REVIEW_TITLES = Arrays.asList(
                "Cash Advance 24/7",
                "Extralend Review",
                "Greenlight Cash Review",
                "Indylend.com Review",
                "Loans Angel Review",
                "Loan Solo Review",
                "Maximus Money Review",
                "Speedy Cash Loans Review",
                "Payday Money Center Loans Review",
                "National Payday Loans Review",
                "Does Debt Consolidation Hurt Your Credit",
                "What Does Debt Consolidation Mean & How it Works",
                "How to Write a Debt Settlement Proposal Letter",
                "How to Negotiate Debt Settlement on Your Own",
                "How to Get Rid of Payday Loans",
                "How to Repay Your Payday Loan Debt",
                "How Much Money Should You Keep in Your Checking Account",
                "Need a Loan but Keep Getting Declined: What to Do",
                "Secured vs Unsecured Loan: What Are the Main Advantages"
        );

        public static final List<String> LOCATION_TITLES = Arrays.asList(
                "Alabama",
                "Alaska",
                "Arizona",
                "Arkansas",
                "California"
        );

        public static final int NUMBER_OF_LOCATION_BUTTONS = 5;
        public static final int NUMBER_OF_POST_BUTTONS_BLOG_CATEGORY = 9;
        public static final int NUMBER_OF_READ_MORE_MAIN_PAGE = 2;
        public static final int NUMBER_OF_VISIT_SITE_REVIEW_CATEGORY = 9;
        public static final int NUMBER_OF_VIEW_PROFILE_REVIEW_CATEGORY = 9;
    }

    public static class ContactUs {
        public static final String NAME = "testTest";
        public static final String EMAIL = "testTest123@gmal.com";
        public static final String COMMENT = "testTesttestTesttestTesttestTest";
        public static final String EMPTY = " ";
    }

    public static class Order {
        public static final String EMAIL = "admintest123@gmail.com";
        public static final String PHONE_NUMBER = "3103400791";
        public static final String SSN = "4214";
        public static final String FIRST_NAME = "John";
        public static final String SECOND_NAME = "Smith";
        public static final String DATE_OF_BIRTH = "04141994";
        public static final String ZIP_CODE = "92210";
        public static final String STREET_ADDRESS = "Garden Lane 90210";
        public static final String ABA_ROUTING_NUMBER = "124003116";
        public static final String BANK_ACCOUNT_NUMBER = "56712365716757";
        public static final String DRIVER_LICENSE_NUMBER = "12421412414";
        public static final String SOCIAL_SECURITY_NUMBER = "421512525";
    }
}
