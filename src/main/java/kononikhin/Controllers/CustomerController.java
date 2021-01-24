package kononikhin.Controllers;

import kononikhin.DAO.RegisteredAddressDaO;
import kononikhin.Entities.RegisteredAddress;
import kononikhin.Entities.ActualAddress;
import kononikhin.Entities.Customer;
import kononikhin.Service.ActualAddressService;
import kononikhin.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    ActualAddressService actualAddressService;

    @Autowired
    RegisteredAddressDaO registeredAddressDaO;

    @GetMapping("/list")
    public String listCustomers(Model model) {

        List<Customer> customers = customerService.getCustomers();

        model.addAttribute("customers", customers);

        return "listCustomers";
    }

    @GetMapping("/showCustomerAddForm")
    public String showAddForm(ModelMap map) {

        Customer customer = new Customer();

        RegisteredAddress registeredRegisteredAddress = new RegisteredAddress();

        ActualAddress actualRegisteredAddress = new ActualAddress();

        map.addAttribute("customer", customer);
        map.addAttribute("registeredAddress", registeredRegisteredAddress);
        map.addAttribute("actualAddress", actualRegisteredAddress);

        return "customerForm";
    }

    @GetMapping("/showCustomerFormUpdate")
    public String showUpdateForm(@RequestParam(name = "customerId") int customerId, Model model) {

        Customer customer = customerService.getCustomer(customerId);

        ActualAddress actualAddress = actualAddressService.getActualAddress(customer.getActualAddress().getId());
        RegisteredAddress registeredAddress = registeredAddressDaO.getRegisteredAddress(customer.getActualAddress().getId());

        model.addAttribute("customer", customer);
        model.addAttribute("actualAddress", actualAddress);
        model.addAttribute("registeredAddress", registeredAddress);

        return "updateForm";
    }


    @PostMapping("/saveCustomerWithAddress")
    public String saveCustomerWithAddress(@ModelAttribute(name = "customer") Customer customer,
                                          @ModelAttribute(name = "actualAddress") ActualAddress actualAddress,
                                          @ModelAttribute(name = "registeredAddress") RegisteredAddress registeredAddress) {


        customerService.saveCustomer(customer, actualAddress,registeredAddress);

        return "redirect:/customer/list";
    }


    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute(name = "customer") Customer customer,
                               @ModelAttribute(name = "registeredAddress") RegisteredAddress registeredAddress,
                               @ModelAttribute(name = "actualAddress") ActualAddress actualAddress,
                               @RequestParam(name = "sameAddress", defaultValue = "false") boolean sameAddress) {

        customerService.saveCustomer(customer, registeredAddress, actualAddress, sameAddress);

        return "redirect:/customer/list";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int id) {

        customerService.deleteCustomer(id);

        return "redirect:/customer/list";
    }

    @GetMapping("/search")
    public String searchCustomers(@RequestParam("searchName") String searchName,
                                  Model model) {

        // search customers from the service
        List<Customer> customers = customerService.searchCustomers(searchName);

        // add the customers to the model
        model.addAttribute("customers", customers);

        return "listCustomers";
    }
}
