package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorQuiz {
	
	@GetMapping("/quiz")
	public String process(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) session.getAttribute("USUARIOS");
		if(usuarios == null) {
			usuarios = new ArrayList<>();
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntuacion = (List<Integer>) session.getAttribute("PUNTUACION");
		if(puntuacion == null) {
			puntuacion = new ArrayList<>();
		}
		model.addAttribute("sessionUsuarios", usuarios);
		model.addAttribute("sessionPuntuacion",puntuacion);
		return "quiz";
	}
	
	@PostMapping("/nombreUsuarios")
	public String nombreUsuarios(@RequestParam("nombre") String nombre, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) request.getSession().getAttribute("USUARIOS");
		if (usuarios == null) {
			usuarios = new ArrayList<>();
			request.getSession().setAttribute("USUARIOS", usuarios);
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntuacion = (List<Integer>) request.getSession().getAttribute("PUNTUACION");
		if (puntuacion == null) {
			puntuacion = new ArrayList<>();
			request.getSession().setAttribute("PUNTUACION", puntuacion);
		}
		usuarios.add(nombre);
		request.getSession().setAttribute("USUARIOS",usuarios);
		request.getSession().setAttribute("PUNTUACION",puntuacion);
		return "redirect:/pregunta1";
	}
	
	//-----------------------------------------------------------------------------------------------------------------------/
	//Pregunta1
	
	@GetMapping("/pregunta1")
	public String pregunta1(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) session.getAttribute("USUARIOS");
		if(usuarios == null) {
			usuarios = new ArrayList<>();
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntuacion = (List<Integer>) session.getAttribute("PUNTUACION");
		if(puntuacion == null) {
			puntuacion = new ArrayList<>();
		}
		model.addAttribute("sessionUsuarios", usuarios);
		model.addAttribute("sessionPuntuacion",puntuacion);
		return "pregunta1";
	}
	
	@PostMapping("/respuesta1")
	public String respuesta1(@RequestParam("puntuacion") String puntuacion, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) request.getSession().getAttribute("USUARIOS");
		if (usuarios == null) {
			usuarios = new ArrayList<>();
			request.getSession().setAttribute("USUARIOS", usuarios);
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntos = (List<Integer>) request.getSession().getAttribute("PUNTUACION");
		if (puntos == null) {
			puntos = new ArrayList<>();
			request.getSession().setAttribute("PUNTUACION", puntos);
		}
			
		puntos.add(Integer.parseInt(puntuacion));
		
		request.getSession().setAttribute("USUARIOS",usuarios);
		request.getSession().setAttribute("PUNTUACION",puntos);
		return "redirect:/pregunta2";
	}
	
	//-----------------------------------------------------------------------------------------------------------------------/
	//Pregunta2
	
	@GetMapping("/pregunta2")
	public String pregunta2(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) session.getAttribute("USUARIOS");
		if(usuarios == null) {
			usuarios = new ArrayList<>();
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntuacion = (List<Integer>) session.getAttribute("PUNTUACION");
		if(puntuacion == null) {
			puntuacion = new ArrayList<>();
		}
		model.addAttribute("sessionUsuarios", usuarios);
		model.addAttribute("sessionPuntuacion",puntuacion);
		return "pregunta2";
	}
	
	@PostMapping("/respuesta2")
	public String respuesta2(@RequestParam("puntuacion") String puntuacion, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) request.getSession().getAttribute("USUARIOS");
		if (usuarios == null) {
			usuarios = new ArrayList<>();
			request.getSession().setAttribute("USUARIOS", usuarios);
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntos = (List<Integer>) request.getSession().getAttribute("PUNTUACION");
		if (puntos == null) {
			puntos = new ArrayList<>();
			request.getSession().setAttribute("PUNTUACION", puntos);
		}
			
		puntos.add(Integer.parseInt(puntuacion));
		
		request.getSession().setAttribute("USUARIOS",usuarios);
		request.getSession().setAttribute("PUNTUACION",puntos);
		return "redirect:/pregunta3";
	}
	
	//-----------------------------------------------------------------------------------------------------------------------/
	//Pregunta3
	
	@GetMapping("/pregunta3")
	public String pregunta3(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) session.getAttribute("USUARIOS");
		if(usuarios == null) {
			usuarios = new ArrayList<>();
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntuacion = (List<Integer>) session.getAttribute("PUNTUACION");
		if(puntuacion == null) {
			puntuacion = new ArrayList<>();
		}
		model.addAttribute("sessionUsuarios", usuarios);
		model.addAttribute("sessionPuntuacion",puntuacion);
		return "pregunta3";
	}
	
	@PostMapping("/respuesta3")
	public String respuesta3(@RequestParam("puntuacion") String puntuacion, HttpServletRequest request) {
		StringTokenizer tokenizer = new StringTokenizer(puntuacion,",");
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) request.getSession().getAttribute("USUARIOS");
		if (usuarios == null) {
			usuarios = new ArrayList<>();
			request.getSession().setAttribute("USUARIOS", usuarios);
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntos = (List<Integer>) request.getSession().getAttribute("PUNTUACION");
		if (puntos == null) {
			puntos = new ArrayList<>();
			request.getSession().setAttribute("PUNTUACION", puntos);
		}
		
		int suma=0;
		while (tokenizer.hasMoreElements()) {
			suma = suma + Integer.parseInt(tokenizer.nextToken());
		}
			
		puntos.add(suma);
		
		request.getSession().setAttribute("USUARIOS",usuarios);
		request.getSession().setAttribute("PUNTUACION",puntos);
		return "redirect:/pregunta4";
	}
	
	//-----------------------------------------------------------------------------------------------------------------------/
	//Pregunta4
	
	@GetMapping("/pregunta4")
	public String pregunta4(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) session.getAttribute("USUARIOS");
		if(usuarios == null) {
			usuarios = new ArrayList<>();
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntuacion = (List<Integer>) session.getAttribute("PUNTUACION");
		if(puntuacion == null) {
			puntuacion = new ArrayList<>();
		}
		model.addAttribute("sessionUsuarios", usuarios);
		model.addAttribute("sessionPuntuacion",puntuacion);
		return "pregunta4";
	}
	
	@PostMapping("/respuesta4")
	public String respuesta4(@RequestParam("puntuacion") String puntuacion, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) request.getSession().getAttribute("USUARIOS");
		if (usuarios == null) {
			usuarios = new ArrayList<>();
			request.getSession().setAttribute("USUARIOS", usuarios);
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntos = (List<Integer>) request.getSession().getAttribute("PUNTUACION");
		if (puntos == null) {
			puntos = new ArrayList<>();
			request.getSession().setAttribute("PUNTUACION", puntos);
		}
			
		puntos.add(Integer.parseInt(puntuacion));
		
		request.getSession().setAttribute("USUARIOS",usuarios);
		request.getSession().setAttribute("PUNTUACION",puntos);
		return "redirect:/pregunta5";
	}
	
	//-----------------------------------------------------------------------------------------------------------------------/
	//Pregunta5
	
	@GetMapping("/pregunta5")
	public String pregunta5(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) session.getAttribute("USUARIOS");
		if(usuarios == null) {
			usuarios = new ArrayList<>();
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntuacion = (List<Integer>) session.getAttribute("PUNTUACION");
		if(puntuacion == null) {
			puntuacion = new ArrayList<>();
		}
		model.addAttribute("sessionUsuarios", usuarios);
		model.addAttribute("sessionPuntuacion",puntuacion);
		return "pregunta5";
	}
	
	@PostMapping("/respuesta5")
	public String respuesta5(@RequestParam("puntuacion") String puntuacion, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) request.getSession().getAttribute("USUARIOS");
		if (usuarios == null) {
			usuarios = new ArrayList<>();
			request.getSession().setAttribute("USUARIOS", usuarios);
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntos = (List<Integer>) request.getSession().getAttribute("PUNTUACION");
		if (puntos == null) {
			puntos = new ArrayList<>();
			request.getSession().setAttribute("PUNTUACION", puntos);
		}
		
		int longitud=puntuacion.length();
		
		if(longitud<15)
			puntos.add(1);
		else if(longitud>=15 && longitud<30)
			puntos.add(2);
		else if(longitud>=15 && longitud<30)
			puntos.add(3);
		else if(longitud>=45)
			puntos.add(4);
		
		request.getSession().setAttribute("USUARIOS",usuarios);
		request.getSession().setAttribute("PUNTUACION",puntos);
		return "redirect:/pregunta6";
	}
	
	//-----------------------------------------------------------------------------------------------------------------------/
	//Pregunta6
	
	@GetMapping("/pregunta6")
	public String pregunta6(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) session.getAttribute("USUARIOS");
		if(usuarios == null) {
			usuarios = new ArrayList<>();
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntuacion = (List<Integer>) session.getAttribute("PUNTUACION");
		if(puntuacion == null) {
			puntuacion = new ArrayList<>();
		}
		model.addAttribute("sessionUsuarios", usuarios);
		model.addAttribute("sessionPuntuacion",puntuacion);
		return "pregunta6";
	}
	
	@PostMapping("/respuesta6")
	public String respuesta6(@RequestParam("puntuacion") String puntuacion, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) request.getSession().getAttribute("USUARIOS");
		if (usuarios == null) {
			usuarios = new ArrayList<>();
			request.getSession().setAttribute("USUARIOS", usuarios);
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntos = (List<Integer>) request.getSession().getAttribute("PUNTUACION");
		if (puntos == null) {
			puntos = new ArrayList<>();
			request.getSession().setAttribute("PUNTUACION", puntos);
		}
			
		puntos.add(Integer.parseInt(puntuacion));
		
		request.getSession().setAttribute("USUARIOS",usuarios);
		request.getSession().setAttribute("PUNTUACION",puntos);
		return "redirect:/pregunta7";
	}
	
	//-----------------------------------------------------------------------------------------------------------------------/
	//Pregunta7
	
	@GetMapping("/pregunta7")
	public String pregunta7(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) session.getAttribute("USUARIOS");
		if(usuarios == null) {
			usuarios = new ArrayList<>();
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntuacion = (List<Integer>) session.getAttribute("PUNTUACION");
		if(puntuacion == null) {
			puntuacion = new ArrayList<>();
		}
		
		int resultado = 0;
		if(session.getAttribute("RESULTADO") != null) {
			resultado = (int) session.getAttribute("RESULTADO");
		} 
		
		model.addAttribute("sessionUsuarios", usuarios);
		model.addAttribute("sessionPuntuacion",puntuacion);
		model.addAttribute("sessionResultado",resultado);
		return "pregunta7";
	}
	
	@PostMapping("/respuesta7")
	public String respuesta7(@RequestParam("puntuacion") String puntuacion, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) request.getSession().getAttribute("USUARIOS");
		if (usuarios == null) {
			usuarios = new ArrayList<>();
			request.getSession().setAttribute("USUARIOS", usuarios);
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntos = (List<Integer>) request.getSession().getAttribute("PUNTUACION");
		if (puntos == null) {
			puntos = new ArrayList<>();
			request.getSession().setAttribute("PUNTUACION", puntos);
		}
			
		puntos.add(Integer.parseInt(puntuacion));
		
		request.getSession().setAttribute("USUARIOS",usuarios);
		request.getSession().setAttribute("PUNTUACION",puntos);
		return "redirect:/paginaResultado";
	}
	
	//-----------------------------------------------------------------------------------------------------------------------/
	//Resultado
	
	@GetMapping("/paginaResultado")
	public String paginaResultado(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) session.getAttribute("USUARIOS");
		if(usuarios == null) {
			usuarios = new ArrayList<>();
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntuacion = (List<Integer>) session.getAttribute("PUNTUACION");
		if(puntuacion == null) {
			puntuacion = new ArrayList<>();
		}
		@SuppressWarnings("unchecked")
		int puntos = 0;
		for (Integer suma : puntuacion) {
			puntos += suma; 
		}
		model.addAttribute("sessionUsuarios", usuarios);
		model.addAttribute("sessionPuntuacion",puntuacion);
		model.addAttribute("sessionResultado",puntos);
		return "paginaResultado";
	}
	
	@PostMapping("/paginaFinal")
	public String paginaFinal(@RequestParam("puntuacion") String puntuacion, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> usuarios = (List<String>) request.getSession().getAttribute("USUARIOS");
		if (usuarios == null) {
			usuarios = new ArrayList<>();
			request.getSession().setAttribute("USUARIOS", usuarios);
		}
		@SuppressWarnings("unchecked")
		List<Integer> puntos = (List<Integer>) request.getSession().getAttribute("PUNTUACION");
		if (puntos == null) {
			puntos = new ArrayList<>();
			request.getSession().setAttribute("PUNTUACION", puntos);
		}
		puntos.add(Integer.parseInt(puntuacion));
		
		int calculo = 0;
		for (Integer suma : puntos) {
			calculo += suma; 
		}
		
		request.getSession().setAttribute("USUARIOS",usuarios);
		request.getSession().setAttribute("PUNTUACION",puntuacion);
		request.getSession().setAttribute("RESULTADO", calculo);
		return "redirect:/paginaResultado";
	}
	
	//-----------------------------------------------------------------------------------------------------------------------/
	//Destruir
	
	@PostMapping("/destruir")
	public String destroySession(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/quiz";
	}
	
}