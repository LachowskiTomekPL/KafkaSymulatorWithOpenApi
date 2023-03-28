//package com.convista.soe.controller;
//
//import com.convista.soe.FindByGenderApi;
//import com.convista.soe.Gender;
//import com.convista.soe.Person;
//import com.convista.soe.PersonResponse;
//import com.convista.soe.service.PersonMapperService;
//import com.convista.soe.service.SoeService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequiredArgsConstructor
//public class Controller implements FindByGenderApi {
//    SoeService soeService;
//    PersonMapperService personMapperService;
//
//    @Override
//    public ResponseEntity<PersonResponse> getGenderById(String gender) {
//
//        //TODO Jesli to u ciebie zadziala to kolejne kroki to:
//        //1. dodac servis do wyciagania danych z bazy
//        //2. wewnatrz serwisu odwolac sie do repozytorium ktore pobierze z bazy wszystkie osoby o wskazanej plci
//        //3. Zmienic opis openApi tak zeby po wygenerowaniu metoda getGenderById zwracala liste PersonDTO
//        //4. Ponownie wygenetowac FindByGenderApi i w tej metodzie wywolac serwis i odeslac liste PersonDTO wyciagnieta z bazy
////        Person person = new Person();
////        person.setFirstName("Jan");
////        person.setLastname("Kowalski");
////        person.setUuid("34343443");
////        person.setGender(Gender.FEMALE);
//
//        return ResponseEntity.ok(personMapperService.mapToPersonResponse());
////        return ResponseEntity.ok(soeService.getGender(person));
//
//    }
//}
