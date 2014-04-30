package cl.apiandroid.ucentral.delegate;

import cl.apiandroid.ucentral.delegate.persona.IPersonaDelegate;

/**
 * Created by xfce on 29-04-14.
 */
public class DelegateLocator {
    private static DelegateLocator ourInstance = new DelegateLocator();

    private IPersonaDelegate personaDelegate;

    public static DelegateLocator getInstance() { return ourInstance;}

    public DelegateLocator(){

    }

    public IPersonaDelegate getPersonaDelegate() {
        return ourInstance.personaDelegate;
    }

    public void setPersonaDelegate(IPersonaDelegate personaDelegate) {
        ourInstance.personaDelegate = personaDelegate;
    }
}
