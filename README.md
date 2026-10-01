┌────────────────────────────────────────────────────────────────────────┐
│                        ColaClientesPrioridad                           │
├────────────────────────────────────────────────────────────────────────┤
│ - ocasionales: Cola                                                    │
│ - asiduos: Cola                                                        │
│ - nOcasionales: int                                                    │
│ - nAsiduos: int                                                        │
├────────────────────────────────────────────────────────────────────────┤
│ + ColaClientesPrioridad()                                              │
│ + agregar(cliente: Object, esAsiduo: boolean): void                    │
│ + consultarPrimero(): Object                                           │
│ + eliminarPrimero(): void                                              │
│ + cantidadOcasionales(): int                                           │
│ + cantidadAsiduos(): int                                               │
│ + estaVacia(): boolean                                                 │
└───────────────────────────────────┬────────────────────────────────────┘
                                    │
                                    │ composición (1 contiene 2)
                                    │
                                    ▼ 2
┌────────────────────────────────────────────────────────────────────────┐
│                                 Cola                                   │
├────────────────────────────────────────────────────────────────────────┤
│ # inicio: Nodo                                                         │
│ # fin: Nodo                                                            │
│ # nDatos: int                                                          │
├────────────────────────────────────────────────────────────────────────┤
│ + estaVacia(): boolean                                                 │
│ + agregar(elem: Object): void                                          │
│ + eliminar(): void                                                     │
│ + tomar(): Object                                                      │
└────────────────────────────────────────────────────────────────────────┘
