package org.junit.jupiter.api;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import tp2uml.Empresa;

class EmpresaTest {
	
	private Empresa unqui;
    
	@BeforeEach
    void initAll() {
        Empresa unqui= new Empresa("UNQui", 12345678);
    }
	
    @Test
    void testGetNombre() {
        assertEquals("UNQui", unqui.getNombre());
    }

    @Test
    void testGetCuit() {
        assertEquals(12345678, unqui.getCuit());
    }
	
}
