//package org.springframework.samples.app.owner;
//
//import org.springframework.util.StringUtils;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
///**
// * <code>Validator</code> for <code>Pet</code> forms.
// * <p>
// * We're not using Bean Validation annotations here because it is easier to define such validation rule in Java.
// * </p>
// */
//public class PetValidator implements Validator {
//
//    private static final String REQUIRED = "required";
//
//    @Override
//    public void validate(Object obj, Errors errors) {
//        Pet pet = (Pet) obj;
//        String name = pet.getName();
//        // name validation
//        if (!StringUtils.hasLength(name)) {
//            errors.rejectValue("name", REQUIRED, REQUIRED);
//        }
//
//        // type validation
//        if (pet.isNew() && pet.getType() == null) {
//            errors.rejectValue("type", REQUIRED, REQUIRED);
//        }
//
//        // birth date validation
//        if (pet.getBirthDate() == null) {
//            errors.rejectValue("birthDate", REQUIRED, REQUIRED);
//        }
//    }
//
//    /**
//     * This Validator validates *just* Pet instances
//     */
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return Pet.class.isAssignableFrom(clazz);
//    }
//}
