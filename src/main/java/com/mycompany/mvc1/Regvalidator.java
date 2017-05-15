/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvc1;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.model.Registration;
import com.model.Registration;

/**
 *
 * @author tomas
 */
public class Regvalidator {

    public class RegValidator implements Validator {

        public boolean supports(Class clazz) {
            return Registration.class.isAssignableFrom(clazz);
        }

        public void validate(Object obj, Errors errors) {
            Registration registration = (Registration) obj;
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.blank.username");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.blank.password");
        }
    }
}
