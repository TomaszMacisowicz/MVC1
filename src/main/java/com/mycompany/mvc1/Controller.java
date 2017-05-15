/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvc1;

import java.net.BindException;

/**
 *
 * @author MAC
 */
public class Controller extends SimpleFormController {

    private RegService registrationService;

    public void setRegistrationService(RegService registrationService) {
        this.registrationService = registrationService;
    }

    public Controller() {
        setCommandClass(Registration.class);
        setCommandName("registration");
    }

    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        Registration registration = (Registration) command;
        registrationService.add(registration);
        return new ModelAndView(getSuccessView());
    }
}
