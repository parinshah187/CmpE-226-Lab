package edu.sjsu.cmpe226.lab.dto;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import edu.sjsu.cmpe226.lab.domain.Book;
import edu.sjsu.cmpe226.lab.domain.NailPolish;
import edu.sjsu.cmpe226.lab.domain.Product;
import edu.sjsu.cmpe226.lab.domain.Refrigerator;
import edu.sjsu.cmpe226.lab.domain.Television;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

public class FreeMarker {
	private Template template;
	private Configuration cfg;

	public FreeMarker() {
		// TODO Auto-generated constructor stub

		/*
		 * 1. Configure FreeMarker
		 * 
		 * You should do this ONLY ONCE, when your application starts, then
		 * reuse the same Configuration object elsewhere.
		 */
		cfg = new Configuration();

		// Where do we load the templates from:
		cfg.setClassForTemplateLoading(FreeMarker.class, "templates");

		// Some other recommended settings:
		cfg.setIncompatibleImprovements(new Version(2, 3, 20));
		cfg.setDefaultEncoding("UTF-8");
		cfg.setLocale(Locale.US);
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

	}

	public void setCategoryTemplate() {
		// Get the template to print all products of a category or home-page
		System.out.println("Getting the category template ready...");
		template = null;
		try {
			template = cfg.getTemplate("products.ftl");
			System.out.println("category template fetched...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out
					.println("Exception thrown while fetching category freemarker template");
		}
	}

	public void setElectronicProductTemplate() {
		// TODO Auto-generated method stub
		System.out.println("Getting the Electronic Product template ready...");
		template = null;
		try {
			template = cfg.getTemplate("electronic_product.ftl");
			System.out.println("electronic product template fetched...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out
					.println("Exception thrown while fetching fashion product freemarker template");
		}
	}

	public void setHomeApplianceProductTemplate() {
		// TODO Auto-generated method stub
		System.out
				.println("Getting the Home Appliance Product template ready...");
		template = null;
		try {
			template = cfg.getTemplate("homeappliance_product.ftl");
			System.out.println("home appliance product template fetched...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out
					.println("Exception thrown while fetching fashion product freemarker template");
		}
	}

	public void setFashionProductTemplate() {
		// TODO Auto-generated method stub
		System.out.println("Getting the Fashion Product template ready...");
		template = null;
		try {
			template = cfg.getTemplate("fashion_product.ftl");
			System.out.println("fashion product template fetched...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out
					.println("Exception thrown while fetching fashion product freemarker template");
		}
	}

	public void setBookProductTemplate() {
		// TODO Auto-generated method stub
		System.out.println("Getting the Book Product template ready...");
		template = null;
		try {
			template = cfg.getTemplate("book_product.ftl");
			System.out.println("book product template fetched...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out
					.println("Exception thrown while fetching fashion product freemarker template");
		}
	}

	public String writeHTMLOutput(List products) {
		System.out.println("In writeHTMLOutput()...");
		Map<String, Object> input = new HashMap<String, Object>();
		input.put("itemslist", products);
		System.out.println("Input Ready");
		System.out.println("Generating output...");
		Writer out = new StringWriter();
		try {
			template.process(input, out);
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out
					.println("Template exception thrown while processing the template");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("IOException thrown while processing template");
		}
		System.out.println("HTML String output prepared!");
		return out.toString();
	}

	public String writeHTMLOutput(NailPolish np) {
		// TODO Auto-generated method stub
		Map<String, Object> input = new HashMap<String, Object>();
		input.put("product", np);
		System.out.println("Input Ready");
		System.out.println("Generating output...");
		Writer out = new StringWriter();
		try {
			template.process(input, out);
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out
					.println("Template exception thrown while processing the template");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("IOException thrown while processing template");
		}
		System.out.println("HTML String output prepared!");
		return out.toString();

	}

	public String writeHTMLOutput(Book b) {
		// TODO Auto-generated method stub
		Map<String, Object> input = new HashMap<String, Object>();
		input.put("product", b);
		System.out.println("Input Ready");
		System.out.println("Generating output...");
		Writer out = new StringWriter();
		try {
			template.process(input, out);
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out
					.println("Template exception thrown while processing the template");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("IOException thrown while processing template");
		}
		System.out.println("HTML String output prepared!");
		return out.toString();
	}

	public String writeHTMLOutput(Television t) {
		Map<String, Object> input = new HashMap<String, Object>();
		input.put("product", t);
		System.out.println("Input Ready");
		System.out.println("Generating output...");
		Writer out = new StringWriter();
		try {
			template.process(input, out);
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out
					.println("Template exception thrown while processing the template");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("IOException thrown while processing template");
		}
		System.out.println("HTML String output prepared!");
		return out.toString();
	}

	public String writeHTMLOutput(Refrigerator r) {
		Map<String, Object> input = new HashMap<String, Object>();
		input.put("product", r);
		System.out.println("Input Ready");
		System.out.println("Generating output...");
		Writer out = new StringWriter();
		try {
			template.process(input, out);
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out
					.println("Template exception thrown while processing the template");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("IOException thrown while processing template");
		}
		System.out.println("HTML String output prepared!");
		return out.toString();
	}

}