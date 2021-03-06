package co.com.endava.kayak.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class KayakPage {

    public static final Target FROM =
            Target.the("").locatedBy("/html/body/div[4]/div/div[2]/div[1]/div[3]/input");

    public static final Target DESTINO =
            Target.the("").locatedBy("/html/body/div[5]/div/div[2]/div[1]/div[3]/input");

    public static final Target CLOSE =
            Target.the("").locatedBy("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div[2]/form[1]/div[1]/div/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[2]");

    public static final Target RESULT =
            Target.the("").locatedBy("//div[contains(text(),'Medellin Jose Maria Cordova')]");

    public static final Target TO =
            Target.the("").locatedBy("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div[2]/form[1]/div[1]/div/div[1]/div/div[3]/div");

    public static final Target TO_SAN_FRANCISCO =
            Target.the("").locatedBy("//*[@id=\"ap-SFO/13852\"]");

    public static final Target DATE_TO_DEPARTURE =
            Target.the("").locatedBy("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div[2]/form[1]/div[1]/div/div[1]/div/div[4]/div/div[1]/div");

    public static final Target MARCH_10 =
            Target.the("").locatedBy("//*[@id=\"stl-jam-cal-202103\"]/div[1]/div[3]/div[2]/div[3]");

    public static final Target MARCH_20 =
            Target.the("").locatedBy("//*[@id=\"stl-jam-cal-202103\"]/div[1]/div[3]/div[3]/div[6]");

    public static final Target SEARCH =
            Target.the("").locatedBy("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div[2]/form[1]/div[1]/div/div[2]/button");

    public static final Target PASSANGERS =
            Target.the("").locatedBy("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div[1]/div[2]/div/button");

    public static final Target ADD_ADULT_PASSANGER =
            Target.the("").locatedBy("/html/body/div[77]/div[2]/div/div/div[1]/div/div[2]/div/div/div[3]/button");

    public static final Target ADD_CHILD_PASSANGER =
            Target.the("").locatedBy("/html/body/div[77]/div[2]/div/div/div[4]/div/div[2]/div/div/div[3]/button");

    public static final Target LOWEST_PRICE_FLIGHT =
                Target.the("").locatedBy("/html/body/div[1]/div[1]/main/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/a[1]");

    public static final Target NEW_DEPARTURE_DATE =
                Target.the("").locatedBy("//div[contains(text(),'mié. 10/3') and @data-placeholder]");

    public static final Target NEW_DEPARTURE_DATE_10_APRIL =
                Target.the("").locatedBy("//*[@id=\"stl-jam-cal-202104\"]/div[1]/div[3]/div[2]/div[6]/div");

    public static final Target NEW_DEPARTURE_DATE_20_APRIL =
                Target.the("").locatedBy("//*[@id=\"stl-jam-cal-202104\"]/div[1]/div[3]/div[4]/div[2]/div");

    public static final Target NEW_SEARCH =
                Target.the("").locatedBy("//div[@aria-label='Buscar vuelos']");

    public static final Target FINAL_FLIGHT =
            Target.the("").locatedBy("/html/body/div[77]/div[4]/div/div/div/div[1]/div/div[1]/h3[1]");

    public static final Target POP_UP_TITLE_2 =
            Target.the("").locatedBy("//div[contains(text(),'Crear una alerta de precio gratis.')]");

    public static final Target RESULTS_FLIGHT =
            Target.the("").locatedBy("//div[contains(@aria-label,'Resultado 2:')]//child::a[@role='button' and contains(@aria-label,'Ver oferta')]//parent::div");

    public static final Target MODAL2 =
            Target.the("").locatedBy("//span[contains(text(),'Cambio por tu cuenta en')]");

    public static final Target MODAL3 =
            Target.the("").locatedBy("//div[contains(text(),'Adquiere nuestros planes de asistencia')]");

}