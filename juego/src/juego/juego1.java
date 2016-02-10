package juego;

import java.util.*;

public class juego1 {
	static Scanner scann = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Estas en asoci, son las 8:30, tienes que estar en casa a las 9:30");
		int random;
		int tiempolimite = 60;
		String respuesta;
		System.out.println("Bajas andando...");
		random = (int) (Math.random() * 3 + 1);
		switch (random) {
		//////////////////////////////////////////////////////////////////////////

		case 1:
			System.out.println(
					"De pronto dos pibes se acercan... te preguntan si tienes algo que te pueda comprometer, que les dices, SI o NO?");
			respuesta = scann.next();
			if (respuesta.equals("SI")) {
				System.out.println("Le entregas tu mota, los guardias estan deliberando...");
				random = (int) (Math.random() * 3 + 1);
				switch (random) {
				case 1:
					System.out.println("Los guardias te dejan en paz... parece que quieren ESO para ellos");
					tiempolimite = tiempolimite - 7;
					System.out.println("Pierdes 7 minutos------> Te quedan " + tiempolimite);
					break;
				case 2:
					System.out.println("El policia se raya y te dan el coñazo un buen rato");
					tiempolimite = tiempolimite - 10;
					System.out.println("Pierdes 10 minutos------> Te quedan " + tiempolimite);
					break;
				case 3:
					System.out.println("Los policias te detienen ");
					System.err.println("Has perdido, pasaras la nuit en el calabozo");
					System.exit(0);
					break;

				}

			} else if (respuesta.equals("NO")) {
				random = (int) (Math.random() * 2 + 1);
				switch (random) {
				case 1:
					System.out.println("Los guardias se fian de ti, puedes marcharte");
					tiempolimite = tiempolimite - 6;
					System.out.println("Pierdes 6 minutos------> Te quedan " + tiempolimite);
					break;
				case 2:
					System.out.println("No se fian y te registran...");
					random = (int) (Math.random() * 2 + 1);
					switch (random) {
					case 1:
						System.out.println("Te encontraron la matuja...");
						random = (int) (Math.random() * 2 + 1);
						switch (random) {
						case 1:
							System.out.println("Se quedan tu mota y ademas te piden papel para luego amablemente");
							tiempolimite = tiempolimite - 13;
							System.out.println("Pierdes 13 minutos------> Te quedan " + tiempolimite);
							break;

						case 2:
							System.err.println("Te han cazado");
							System.exit(0);
							break;
						}

						break;

					case 2:
						System.out.println("No te encuentran nada, puedes proseguir afablemente");
						tiempolimite = tiempolimite - 8;
						System.out.println("Pierdes 8 minutos------> Te quedan " + tiempolimite);

						break;
					}
					break;

				}
			}
			break;
		//////////////////////////////////////////////////////////////////////////

		case 2:
			System.out
					.println("De pronto oyes musica detras de ti, te giras y te encuentras al Charflex en su rueda..");
			System.out.println("Te pide un pitillo,se lo DAS o NIDE");
			respuesta = scann.next();
			if (respuesta.equals("DAS")) {
				random = (int) (Math.random() * 2 + 1);
				switch (random) {
				case 1:
					System.out.println("Charflex acepta el piti de buen grado y te ofrece un jardula, QUIERES o NO?");
					respuesta = scann.next();
					if (respuesta.equals("QUIERES")) {
						random = (int) (Math.random() * 2 + 1);
						switch (random) {
						case 1:
							System.out.println("Vaya, parece que esta viniendo DuDu...");
							System.out.println("Dudu se queda a echar unos joints y se alarga mas de lo esperado...");
							random = (int) (Math.random() * (25 - 14 + 1) + 14);
							tiempolimite = tiempolimite - random;
							System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
							break;

						case 2:
							System.out.println("El Charflex se estaca el canuto y te quedas sin nada");
							tiempolimite = tiempolimite - 6;
							System.out.println("Pierdes 6 minutos------> Te quedan " + tiempolimite);
							break;
						}

					} else if (respuesta.equals("NO")) {
						tiempolimite = tiempolimite - 7;
						System.out.println("Pierdes 7 minutos------> Te quedan " + tiempolimite);

					}

					break;

				case 2:
					System.out.println("El Charflex se fuma el piti rapidamente mientras se pira");
					tiempolimite = tiempolimite - 6;
					System.out.println("Pierdes 6 minutos------> Te quedan " + tiempolimite);
					break;
				}
			} else if (respuesta.equals("NIDE")) {
				random = (int) (Math.random() * 2 + 1);
				switch (random) {
				case 1:
					System.out.println("El Charflex se enoja...");
					random = (int) (Math.random() * 3 + 1);
					switch (random) {
					case 1:
						System.out.println("Parece que se le pasa el enfado y va a buscarse otro pitillo");
						tiempolimite = tiempolimite - 8;
						System.out.println("Pierdes 8 minutos------> Te quedan " + tiempolimite);
						break;

					case 2:
						System.out.println("Te da la brasa bastante jebi y pierdes bastante tiempo...");
						random = (int) (Math.random() * (20 - 12 + 1) + 12);
						tiempolimite = tiempolimite - random;
						System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);

						break;

					case 3:
						System.err.println("Te lleva al LFAM... donde se encargaran de ti pipudo");
						System.exit(0);
						break;
					}

					break;

				case 2:
					System.out.println("Antes de acabar de decirle que nide ya esta muy lejos con su rueda...");
					tiempolimite = tiempolimite - 7;
					System.out.println("Pierdes 7 minutos------> Te quedan " + tiempolimite);

					break;
				}
			}
			break;

		//////////////////////////////////////////////////////////////////////
		case 3:
			System.out.println("Te topas con el mismisimo Caidy Kain aKa D. Gomez y te propone grabar un videoclip...");
			System.out.println("Que le dices SI o NO");
			respuesta = scann.next();
			if (respuesta.equals("SI")) {
				random = (int) (Math.random() * 3 + 1);
				switch (random) {
				case 1:
					System.out.println("Ya te llamara para su siguiente video...");
					tiempolimite = tiempolimite - 5;
					System.out.println("Pierdes 5 minutos------> Te quedan " + tiempolimite);
					break;

				case 2:
					System.out.println("Te mete una chapa de su idea del tema que va sacar...");
					random = (int) (Math.random() * (16 - 10 + 1) + 10);
					tiempolimite = tiempolimite - random;
					System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
					break;
				case 3:
					System.out.println("Esta to feliz con la idea y te propone unirte a Perreo69, SI o KVA?");
					respuesta = scann.next();
					if (respuesta.equals("SI")) {
						random = (int) (Math.random() * 2 + 1);
						switch (random) {
						case 1:
							System.out.println("Esta el triple de contento y hasta te regala un joint");
							tiempolimite = tiempolimite - 8;
							System.out.println("Pierdes 8 minutos------> Te quedan " + tiempolimite);
							break;

						case 2:
							System.out.println("Te invita a su rulote de yumiskeo con el Seco");
							random = (int) (Math.random() * (25 - 15 + 1) + 15);
							tiempolimite = tiempolimite - random;
							System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
							break;
						}

					} else if (respuesta.equals("KVA")) {
						random = (int) (Math.random() * 2 + 1);
						switch (random) {
						case 1:
							System.out.println("El pobre Caidy se decepciona y se va llorando");
							tiempolimite = tiempolimite - 8;
							System.out.println("Pierdes 8 minutos------> Te quedan " + tiempolimite);
							break;

						case 2:
							System.out.println("Como ultimo intento llama al Khaled pa intentar convencerte");
							tiempolimite = tiempolimite - 12;
							System.out.println("Pierdes 12 minutos------> Te quedan " + tiempolimite);
							break;
						}

					}
					break;
				}

			} else if (respuesta.equals("NO")) {
				random = (int) (Math.random() * 2 + 1);
				switch (random) {
				case 1:
					System.out.println("- Va me suda la polla ya llamare al Dione");
					tiempolimite = tiempolimite - 6;
					System.out.println("Pierdes 6 minutos------> Te quedan " + tiempolimite);
					break;

				case 2:
					System.out.println(
							"Se china que fliiiipas y te amenaza de muerte, que haces PARTIRTE la polla o CAGARTE en sus muertos?");
					respuesta = scann.next();
					if (respuesta.equals("PARTIRTE")) {
						random = (int) (Math.random() * 2 + 1);
						switch (random) {
						case 1:
							System.out.println("Se lo toma a coña y se pira descojonandose");
							tiempolimite = tiempolimite - 7;
							System.out.println("Pierdes 7 minutos------> Te quedan " + tiempolimite);
							break;

						case 2:
							System.err.println("Le hinchas las pelotas demasiado y acaba contigo");
							System.exit(0);
							break;
						}

					} else if (respuesta.equals("CAGARTE")) {
						random = (int) (Math.random() * 2 + 1);
						switch (random) {
						case 1:
							System.out.println("Te roba hasta la vida");
							tiempolimite = tiempolimite - 13;
							System.out.println("Pierdes 13 minutos------> Te quedan " + tiempolimite);
							break;

						case 2:
							System.err.println("Le hinchas las pelotas demasiado y acaba contigo");
							System.exit(0);
							break;
						}

					}
					break;
				}
			}

			break;

		}

		//////////////////////////////////////////////////////////////////////

		System.out.println("Pffff, parece que ya ha pasado lo peor...");
		System.out.println("Sigues bajando y ya estas por Peñuelas... te quedan " + tiempolimite + " minutos");
		random = (int) (Math.random() * 3 + 1);
		switch (random) {
		/////////////////////////////////////////////////////////////////////
		case 1:
			System.out.println("Oooooooostiaaaaa, parece que Kinder Malo esta por el barrio...");
			System.out.println("Llega el puto Kinder y te ofrece algo que no podras rechazar...");
			System.out.println("Quieres saber que te ofrece? SI o NO?");
			respuesta = scann.next();
			if (respuesta.equals("SI")) {
				System.out.println("- Me CAGAS en la boca o SUDAS?");
				respuesta = scann.next();
				if (respuesta.equals("CAGAS")) {
					random = (int) (Math.random() * 3 + 1);
					switch (random) {
					case 1:
						System.out.println("Te comes un kiwi y le jiñas hasta el ultimo grumo... LE ENCANTA");
						random = (int) (Math.random() * (18 - 10 + 1) + 10);
						tiempolimite = tiempolimite - random;
						System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
						break;
					case 2:
						System.out.println("Te encuentras algo extreñido y no le das ni gota de placer");
						tiempolimite = tiempolimite - 8;
						System.out.println("Pierdes 8 minutos------> Te quedan " + tiempolimite);
						break;
					case 3:
						System.out.println("De tanta mierda se atraganta y la palma...");
						System.out.println("Viene Pimp Flaco y te pone los huevos de corbata...");
						tiempolimite = tiempolimite - 18;
						System.out.println("Pierdes 18 minutos------> Te quedan " + tiempolimite);
						break;
					}

				} else if (respuesta.equals("SUDAS")) {
					random = (int) (Math.random() * 2 + 1);
					switch (random) {
					case 1:
						System.out.println("Te llora mazo y te toca aguantarle...");
						tiempolimite = tiempolimite - 10;
						System.out.println("Pierdes 18 minutos------> Te quedan " + tiempolimite);
						break;
					case 2:
						System.out.println("Se china jebi y te caga el en la boca :$");
						random = (int) (Math.random() * (22 - 10 + 1) + 10);
						tiempolimite = tiempolimite - random;
						System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
						break;
					}

				}

			} else if (respuesta.equals("NO")) {
				random = (int) (Math.random() * 3 + 1);
				switch (random) {
				case 1:
					System.out.println("Te piras corriendo como un cabron");
					tiempolimite = tiempolimite - 7;
					System.out.println("Pierdes 7 minutos------> Te quedan " + tiempolimite);
					break;

				case 2:
					System.out.println("Le suda la polla y te lo dice igual...");
					System.out.println("- Me CAGAS en la boca o SUDAS?");
					respuesta = scann.next();
					if (respuesta.equals("CAGAS")) {
						random = (int) (Math.random() * 3 + 1);
						switch (random) {
						case 1:
							System.out.println("Te comes un kiwi y le jiñas hasta el ultimo grumo... LE ENCANTA");
							random = (int) (Math.random() * (18 - 10 + 1) + 10);
							tiempolimite = tiempolimite - random;
							System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
							break;
						case 2:
							System.out.println("Te encuentras algo extreñido y no le das ni gota de placer");
							tiempolimite = tiempolimite - 8;
							System.out.println("Pierdes 8 minutos------> Te quedan " + tiempolimite);
							break;
						case 3:
							System.out.println("De tanta mierda se atraganta y la palma...");
							System.out.println("Viene Pimp Flaco y te pone los huevos de corbata...");
							tiempolimite = tiempolimite - 18;
							System.out.println("Pierdes 18 minutos------> Te quedan " + tiempolimite);
							break;
						}

					} else if (respuesta.equals("SUDAS")) {
						random = (int) (Math.random() * 2 + 1);
						switch (random) {
						case 1:
							System.out.println("Te llora mazo y te toca aguantarle...");
							tiempolimite = tiempolimite - 10;
							System.out.println("Pierdes 18 minutos------> Te quedan " + tiempolimite);
							break;
						case 2:
							System.out.println("Se china jebi y te caga el en la boca :$");
							random = (int) (Math.random() * (22 - 10 + 1) + 10);
							tiempolimite = tiempolimite - random;
							System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
							break;
						}

					}
					break;
				case 3:
					System.out.println("Llama al Cecilio para darte una paliza...");
					random = (int) (Math.random() * 2 + 1);
					switch (random) {
					case 1:
						System.err.println("Viene el puto Ceci y te dan de palos");
						System.exit(0);
						break;

					case 2:
						System.out.println(
								"El Ceci se esta montando un video de niggis y putas y no puede acudir a la llamada del Kinder");
						tiempolimite = tiempolimite - 8;
						System.out.println("Pierdes 8 minutos------> Te quedan " + tiempolimite);
						break;
					}

					break;
				}

			}
			break;
		///////////////////////////////////////////////////////////////////

		case 2:
			System.out.println("MI PUTA MADRE, viene el Diablo de Villaverde...");
			System.out.println("Te pide un piti, se lo DAS o NO?");
			respuesta = scann.next();
			if (respuesta.equals("DAS")) {
				random = (int) (Math.random() * 2 + 1);
				switch (random) {
				case 1:
					System.out.println("Se pira...");
					tiempolimite = tiempolimite - 7;
					System.out.println("Pierdes 7 minutos------> Te quedan " + tiempolimite);
					break;
				case 2:
					System.out.println("Aun dandoselo te la chapa un buen rato...");
					random = (int) (Math.random() * (25 - 15 + 1) + 15);
					tiempolimite = tiempolimite - random;
					System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
					break;
				}
			} else if (respuesta.equals("NO")) {
				random = (int) (Math.random() * 2 + 1);
				switch (random) {
				case 1:
					System.out.println("Parece que se pira...");
					random = (int) (Math.random() * 2 + 1);
					switch (random) {
					case 1:
						System.out.println("Se piró");
						tiempolimite = tiempolimite - 7;
						System.out.println("Pierdes 7 minutos------> Te quedan " + tiempolimite);
						break;

					case 2:
						System.out.println("Se ha dado la vuelta y te sigue dando el coñazo, te PIRAS o te QUEDAS?");
						respuesta = scann.next();
						if (respuesta.equals("PIRAS")) {
							random = (int) (Math.random() * 2 + 1);
							switch (random) {
							case 1:
								System.out.println("Te persigue y te raya que flipas...");
								random = (int) (Math.random() * (20 - 8 + 1) + 8);
								tiempolimite = tiempolimite - random;
								System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
								break;
							case 2:
								System.out.println("Se vuelve to loco y te pega de palos");
								random = (int) (Math.random() * (40 - 10 + 1) + 10);
								tiempolimite = tiempolimite - random;
								System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
								break;
							}

						} else if (respuesta.equals("QUEDAS")) {
							random = (int) (Math.random() * 2 + 1);
							switch (random) {
							case 1:
								System.out.println("Te intenta robar todito pero no se lleva nada");
								random = (int) (Math.random() * (16 - 10 + 1) + 10);
								tiempolimite = tiempolimite - random;
								System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
								break;
							case 2:
								System.err.println(
										"El puto Diablo se piensa que le estas vacilando y te pincha con la navaja");
								break;
							}

						}
						break;
					}

					break;

				case 2:
					System.out.println("Aparece su colega y le da un piti...");
					random = (int) (Math.random() * 2 + 1);
					switch (random) {
					case 1:
						System.out.println("Aun asi se raya y te intenta robar...");
						random = (int) (Math.random() * 2 + 1);
						switch (random) {
						case 1:
							System.out.println("Pero te resistes y al final no te roba");
							tiempolimite = tiempolimite - 7;
							System.out.println("Pierdes 7 minutos------> Te quedan " + tiempolimite);
							break;

						case 2:
							System.out.println("El guarro te roba el carhartt");
							tiempolimite = tiempolimite - 11;
							System.out.println("Pierdes 11 minutos------> Te quedan " + tiempolimite);
							break;
						}
						break;

					case 2:
						System.out.println("Los dos juntos te empiezan a rayar... ahora son 2!!, HUYES o LUCHAS?");
						respuesta = scann.next();
						if (respuesta.equals("HUYES")) {
							random = (int) (Math.random() * 2 + 1);
							switch (random) {
							case 1:
								System.out.println("La bomba de humo funciono, escapaste sin problemas");
								tiempolimite = tiempolimite - 10;
								System.out.println("Pierdes 10 minutos------> Te quedan " + tiempolimite);
								break;

							case 2:
								System.out.println("Te enganchan de nuevo y te rayan que fliiiipas");
								random = (int) (Math.random() * (28 - 10 + 1) + 10);
								tiempolimite = tiempolimite - random;
								System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
								break;
							}

						} else if (respuesta.equals("LUCHAS")) {
							random = (int) (Math.random() * 2 + 1);
							switch (random) {
							case 1:
								System.out.println("Es una pelea limpia cotra el Diablo");
								random = (int) (Math.random() * (15 - 10 + 1) + 10);
								tiempolimite = tiempolimite - random;
								System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
								break;
							case 2:
								System.out.println("Se mete su colega y estas bien puteado...");
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println("Te dan duro de palos...");
									random = (int) (Math.random() * (25 - 12 + 1) + 12);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;
								case 2:
									System.err.println("Se ensañan coontigo y acabas en la UVI");
									break;
								}

								break;
							}

						}
						break;
					}

					break;

				}

			}
			break;

		///////////////////////////////////////////////////////////////////
		case 3:
			System.out.println("Coño... pero si es el puto Jincho, que pasa brother?");
			System.out.println("El Jincho te ofrece echarte un porrazo en Peñuelas, te RENTA o NO?");
			respuesta = scann.next();
			if (respuesta.equals("RENTA")) {
				random = (int) (Math.random() * 2 + 1);
				switch (random) {
				case 1:
					System.out.println("Os echais el porro rapido porque el Jincho se tiene que pirar a Tai");
					tiempolimite = tiempolimite - 8;
					System.out.println("Pierdes 8 minutos------> Te quedan " + tiempolimite);
					break;

				case 2:
					System.out.println("Te ofrece un buen JATI o MOTA que quieres?");
					respuesta = scann.next();
					if (respuesta.equals("JATI")) {
						random = (int) (Math.random() * 2 + 1);
						switch (random) {
						case 1:
							System.out.println("Se le cae el jati al suelo y se tiene que liar otro");
							System.out.println("Te QUEDAS a esperar o CHAPAS?");
							if (respuesta.equals("QUEDAS")) {
								random = (int) (Math.random() * 3 + 1);
								switch (random) {
								case 1:
									System.out.println(
											"Se vuelve a rular otro y lo estacais placidamente aKa Placido Domingo");
									random = (int) (Math.random() * (23 - 15 + 1) + 15);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;
								case 2:
									System.out.println(
											"Mientras lo fumais se hace un uñote con el viento y el Jincho lo cura con mimo");
									random = (int) (Math.random() * (30 - 20 + 1) + 20);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);

									break;
								case 3:
									System.out.println("Se le vuelve a caer el canuto y decides pirarte por tu camino");
									random = (int) (Math.random() * (20 - 12 + 1) + 12);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;
								}

							} else if (respuesta.equals("CHAPAS")) {
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println("Se raya qur flipas y se hace un champagne para el solo");
									random = (int) (Math.random() * (20 - 10 + 1) + 10);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;

								case 2:
									System.out.println("Se raya k fliiiipas...");
									random = (int) (Math.random() * 2 + 1);
									switch (random) {
									case 1:
										System.out.println(
												"Te pica el mechero y tienes que perseguirle para recuperarlo");
										for (int i = 0; i == 1; i++) {
											System.out.println("Quieres correr a recuperarlo, SI o NO?");
											respuesta = scann.next();
											if (respuesta.equals("SI")) {
												random = (int) (Math.random() * 3 + 1);
												switch (random) {
												case 1:
													System.out.println(
															"Has pillado al cabron, y consigues recuperar el mechero");
													i = 1;
													break;
												case 2:
													System.out.println("Mierda no le has pillado");
													tiempolimite = tiempolimite - 1;
													System.out.println(
															"Pierdes 1 minutos------> Te quedan " + tiempolimite);
													;

													break;
												case 3:
													System.out.println("Hijoputa como corre");
													tiempolimite = tiempolimite - 1;
													System.out.println(
															"Pierdes 1 minutos------> Te quedan " + tiempolimite);
													;
													break;
												}

											} else if (respuesta.equals("NO")) {
												System.out.println("Te marchas resignado");
												i = 1;
											}

										}
										tiempolimite = tiempolimite - 10;
										System.out.println("Pierdes 10 minutos------> Te quedan " + tiempolimite);
										break;

									case 2:
										System.err.println("Te revienta de un patadon de Tai, estas JODIDOOO");
										break;
									}
									break;
								}

							}
							break;

						case 2:
							System.out.println("Se lia ese buen jati y lo echais a pachas");
							tiempolimite = tiempolimite - 12;
							System.out.println("Pierdes 12 minutos------> Te quedan " + tiempolimite);
							break;
						}

					} else if (respuesta.equals("MOTA")) {
						random = (int) (Math.random() * 3 + 1);
						switch (random) {
						case 1:
							System.out.println("Se rula un amnesiote y os quedais ahi de apalanque");
							random = (int) (Math.random() * (20 - 10 + 1) + 10);
							tiempolimite = tiempolimite - random;
							System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
							break;
						case 2:
							System.out.println(
									"Valgame, aparece el puto Egozz que iba de pasada y se hace un joint tambien");
							random = (int) (Math.random() * (25 - 12 + 1) + 12);
							tiempolimite = tiempolimite - random;
							System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
							break;
						case 3:
							System.out.println(
									"El motas tiene buena pinta pero el puto Jincho se lo esta estacando, se lo PIDES o PASAS?");
							respuesta = scann.next();
							if (respuesta.equals("PIDES")) {
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println(
											"Te lo pasa con la sonrisilla de Jincho en boca y lo estacais a pachas");
									random = (int) (Math.random() * (20 - 10 + 1) + 10);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;

								case 2:
									System.out
											.println("Parece que no le hace mucha gracia que se lo pidas... INSISTES?");
									respuesta = scann.next();
									if (respuesta.equals("INSISTES")) {
										random = (int) (Math.random() * 2 + 1);
										switch (random) {
										case 1:
											System.out.println("Al final te lo acaba pasando...");
											tiempolimite = tiempolimite - 12;
											System.out.println("Pierdes 12 minutos------> Te quedan " + tiempolimite);
											break;

										case 2:
											System.err.println(
													"El Jincho esta hasta la polla de que le jodas y te la lia para subir a casa de peloverde, no llegas a tu kell ni de coña");
											break;
										}

									} else {
										System.out.println("Te piras por tu camino sin haber catado ni un tiro");
										random = (int) (Math.random() * (15 - 9 + 1) + 9);
										tiempolimite = tiempolimite - random;
										System.out.println(
												"Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									}
									break;
								}

							} else if (respuesta.equals("PASAS")) {
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println("Esperas a k se eche el pey y te vas por donde has venido");
									tiempolimite = tiempolimite - 12;
									System.out.println("Pierdes 12 minutos------> Te quedan " + tiempolimite);
									break;

								case 2:
									System.out.println(
											"El Jincho aproveha que estas rayao pensando y te pica el mechero");
									for (int i = 0; i == 1; i++) {
										System.out.println("Quieres correr a recuperarlo, SI o NO?");
										respuesta = scann.next();
										if (respuesta.equals("SI")) {
											random = (int) (Math.random() * 3 + 1);
											switch (random) {
											case 1:
												System.out.println(
														"Has pillado al cabron, y consigues recuperar el mechero");
												i = 1;
												break;
											case 2:
												System.out.println("Mierda no le has pillado");
												tiempolimite = tiempolimite - 1;
												System.out
														.println("Pierdes 1 minutos------> Te quedan " + tiempolimite);
												;

												break;
											case 3:
												System.out.println("Puto velocirraptor...");
												tiempolimite = tiempolimite - 1;
												System.out
														.println("Pierdes 1 minutos------> Te quedan " + tiempolimite);
												;
												break;
											}

										} else if (respuesta.equals("NO")) {
											System.out.println("Te marchas resignado");
											i = 1;
										}

									}
									tiempolimite = tiempolimite - 10;
									System.out.println("Pierdes 10 minutos------> Te quedan " + tiempolimite);
									break;
								}

							}
							break;
						}

					}
					break;
				}

			} else if (respuesta.equals("NO")) {
				random = (int) (Math.random() * 3 + 1);
				switch (random) {
				case 1:
					System.out.println("- OK");
					tiempolimite = tiempolimite - 8;
					System.out.println("Pierdes 8 minutos------> Te quedan " + tiempolimite);
					break;

				case 2:
					System.out.println("- Como que no puto bolo?");
					System.out.println("El Jincho te da el coñazo para que te quedes pero intentas zafarte...");
					random = (int) (Math.random() * 2 + 1);
					switch (random) {
					case 1:
						System.out.println("Lograste huir de las zarpas del Jincho");
						random = (int) (Math.random() * (12 - 8 + 1) + 8);
						tiempolimite = tiempolimite - random;
						System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
						break;

					case 2:
						System.out.println("No puedes escapar de el y te toca quedarte un buen rato");
						random = (int) (Math.random() * (15 - 9 + 1) + 9);
						tiempolimite = tiempolimite - random;
						System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
						break;
					}

					break;
				case 3:
					System.out.println("Parece que al Jincho no le hace gracia que te quieras pirar...");
					random = (int) (Math.random() * 2 + 1);
					switch (random) {
					case 1:
						System.out.println("Te acaba liando un buen rato contandote k ya no es arbitro de basket");
						random = (int) (Math.random() * (20 - 12 + 1) + 12);
						tiempolimite = tiempolimite - random;
						System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
						break;
					case 2:
						System.err.println("Le entra una neura que flipas y te deja atado a un banco en Peñuelas");
						break;
					}

					break;
				}

			}
			break;
		}
		//////////////////////////////////////////////////////////////////////

		System.out.println("Al fin parece que se acabo todo... ");
		System.out
				.println("Sigues bajando y ya estas por la Comisaria de rio... te quedan " + tiempolimite + " minutos");
				//////////////////////////////////////////////////////////////////////

		//////////////////////////////////////////////////////////////////////
		System.out.println("Ya esta acabando tu camino... Pero aun te queda la decision mas dura que tomar");
		System.out.println("Ya estas por bankitos y derrepente se acerca Eli, te ofrece subir a su casa........");
		System.out.println("Justo antes de responder te encuentras al Furia viniendo por el otro lado........");
		System.out.println("De pronto una furgoneta lo arroya, que coño haras ahora?");
		System.out.println("Tan solo te quedan " + tiempolimite
				+ " minutos, que haces SUBES a casa de Eli o AUXILIAS al Furioso?");
		respuesta = scann.next();
		if (respuesta.equals("SUBES")) {
			System.out.println("Mientras subes fichas k Furioso a muerto...");
			System.out.println("Subes a casa con Eli...");
			random = (int) (Math.random() * 2 + 1);
			switch (random) {
			case 1:
				System.out.println(
						"Os sentais comodamente en su cama y te ofrece echar un joint, que la dices que SI o te la intentas FOLLAR de una?");
				respuesta = scann.next();
				if (respuesta.equals("SI")) {
					random = (int) (Math.random() * 3 + 1);
					switch (random) {
					case 1:
						System.out
								.println("Parece que falta el piti, gracias a dios compraste uno en el chino de abajo");
						System.out.println("Comenzais a fumar ese joint... Han pasado 6 minutos");
						tiempolimite = tiempolimite - 6;
						random = (int) (Math.random() * 2 + 1);
						switch (random) {
						case 1:
							System.out.println("Se pone to perra y parece que te quiere follar...");
							respuesta = "FOLLAR";
							break;

						case 2:
							System.out.println("Parece que tiene ganas de juerga y se llama a una chavalina...");
							System.out.println("Te la juegas a proponer un TRIO o te haces la HUIDA?");
							respuesta = scann.next();
							if (respuesta.equals("TRIO")) {
								System.out.println("Te dispones a la hazaña de tu vida...");
								random = (int) (Math.random() * 3 + 1);
								switch (random) {
								case 1:
									System.out.println("Te las follas a ambas hasta que no puedes mas");
									random = (int) (Math.random() * (30 - 10 + 1) + 10);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;
								case 2:
									System.err.println("Te da un jari de la emocion y mueres");
									System.exit(0);
									break;
								case 3:
									System.out.println("Te las follas a ambas hasta que no puedes mas");
									random = (int) (Math.random() * (30 - 10 + 1) + 10);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;
								}
							} else if (respuesta.equals("HUIDA")) {
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println("CONSEGUISTE SALIR Y YA RULAS PARA TU CASA");
									random = (int) (Math.random() * (20 - 10 + 1) + 10);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;

								case 2:
									System.err.println(
											"Segun bajas a la calle corres la misma suerte que el compadre Furia, eso te pasa por no ayudarlo");
									System.exit(0);
									break;
								}

							}

							break;
						}

						break;

					case 2:
						System.out.println("Echais el joint tranquilamente");
						random = (int) (Math.random() * (20 - 10 + 1) + 10);
						tiempolimite = tiempolimite - random;
						System.out.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
						System.out.println("Te la intentas FOLLAR o ya te VAS?");
						respuesta = scann.next();
						if (respuesta.equals("VAS")) {
							System.out.println("CONSEGUISTE SALIR Y YA RULAS PARA TU CASA");
						}
						break;
					case 3:
						System.err.println(
								"Falta piti y ninguno de los dos teneis... te manda a la puta mierda y quedas destrozado");
						System.exit(0);
						break;
					}

				}
				if (respuesta.equals("FOLLAR")) {
					random = (int) (Math.random() * 2 + 1);
					switch (random) {
					case 1:
						System.out.println("Parece que vamos pa alante y te dispones al tema");
						System.out.println("De pronto no recuerdas si llevabas la goma o no...");
						random = (int) (Math.random() * 2 + 1);
						switch (random) {
						case 1:
							System.out.println("Vaya, parece que has tenido suerte");
							random = (int) (Math.random() * 2 + 1);
							switch (random) {
							case 1:
								System.out.println(
										"Y tanta es la suerte que es de sabor a tutifruti, su sabor favorito..");
								System.out.println("Le da al manubrio cual niño al calipo..");
								System.out.println("Entonces parece que se pone bien seria al tema...");
								tiempolimite = tiempolimite - 10;
								break;
							case 2:
								System.out.println("Te olvidastes de coger los de sabores y solo tienes el clasico..");
								System.out.println("Not bad ;)");
								System.out.println("Entonces parece que se pone bien seria al tema...");
								tiempolimite = tiempolimite - 7;
								break;
							}
							System.out.println("Vaya, hay algo que la echa para atras..");
							System.out.println("Parece que tiene chorvo y se siente sucia");
							System.out.println("Que haces? tratas de CONVENCERLA o te CALLAS?");
							respuesta = scann.next();
							if (respuesta.equals("CONVENCERLA")) {
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println("Te curras una respuesta que fliipas");
									System.out.println("........");
									System.out.println("Te la follas");
									random = (int) (Math.random() * (25 - 14 + 1) + 14);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;
								case 2:
									System.err.println("Se lo toma mal y te manda a paseo");
									System.exit(0);
									break;
								}
								break;
							} else if (respuesta.equals("CALLAS")) {
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println("Aunque poco la dura la preocupacion..");
									System.out.println("Te la follas");
									random = (int) (Math.random() * (30 - 20 + 1) + 20);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;

								case 2:
									System.out.println("Se hace la dura, parece que quiere que la incites..");
									System.out.println("Que hacemos locoo? La INCITAS o PASAS?");
									respuesta = scann.next();
									if (respuesta.equals("INCITAS")) {
										random = (int) (Math.random() * 2 + 1);
										switch (random) {
										case 1:
											System.out.println("Hoy es tu dia de suerte, quiere que seas su papito..");
											System.out.println("ALICATAO! el camino a casa ahora será mas fructifero");
											random = (int) (Math.random() * (30 - 10 + 1) + 10);
											tiempolimite = tiempolimite - random;
											System.out.println(
													"Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
											break;

										case 2:
											System.err.println("Te has canteado demasiado.. Te ha echado");
											System.out.println("Prosigues con tu camino a casa");
											random = (int) (Math.random() * (20 - 10 + 1) + 10);
											tiempolimite = tiempolimite - random;
											System.out.println(
													"Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
											break;
										}
									} else if (respuesta.equals("PASAS")) {
										random = (int) (Math.random() * 2 + 1);
										switch (random) {
										case 1:
											System.out.println("Aun asi esta demasiado caliente y se lanza al ataque");
											System.out.println("......");
											System.out.println("Bien feliz que vuelves hoy a casa");
											random = (int) (Math.random() * (30 - 10 + 1) + 10);
											tiempolimite = tiempolimite - random;
											System.out.println(
													"Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
											break;

										case 2:
											System.err.println("- Menudo sosainas, vete a cagar chaval");
											System.exit(0);
											break;
										}
									}
									break;
								}
								break;
							}

						case 2:
							System.out.println("Putada, parece que la dejastes en casa..");
							random = (int) (Math.random() * 2 + 1);
							switch (random) {
							case 1:
								System.out.println("La piva sigue pa alante, parece que no la importa a pelo..");
								System.out.println("......");
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println("Buen polvazo campeon, te lo has ganao");
									random = (int) (Math.random() * (30 - 10 + 1) + 10);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;
								case 2:
									System.err.println("La dejas embarazada, ahora si que estas biien jodido..");
									System.exit(0);
									break;
								}
								break;

							case 2:
								System.out.println("Oh, parece que es demasiado higienica..");
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println("Aun asi, parece que va a tirar de labia...");
									System.out.println("Te mete un par de lametazos y te despacha rapido");
									random = (int) (Math.random() * (18 - 10 + 1) + 10);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;

								case 2:
									System.out.println("Parece que no la chupa, estamos jodidos..");
									System.out.println("Parece que no hay mas opcion que tirar para casa");
									tiempolimite = tiempolimite - 10;
									System.out.println("Pierdes 10 minutos------> Te quedan " + tiempolimite);
									break;
								}
								break;
							}
							break;
						}
						break;

					case 2:
						System.out.println("Parece que vamos pa alante y te dispones al tema");
						System.out.println("De pronto no recuerdas si llevabas la goma o no...");
						random = (int) (Math.random() * 2 + 1);
						switch (random) {
						case 1:
							System.out.println("Vaya, parece que has tenido suerte");
							random = (int) (Math.random() * 2 + 1);
							switch (random) {
							case 1:
								System.out.println(
										"Y tanta es la suerte que es de sabor a tutifruti, su sabor favorito..");
								System.out.println("Le da al manubrio cual niño al calipo..");
								System.out.println("Entonces parece que se pone bien seria al tema...");
								tiempolimite = tiempolimite - 10;
								break;
							case 2:
								System.out.println("Te olvidastes de coger los de sabores y solo tienes el clasico..");
								System.out.println("Entonces parece que se pone bien seria al tema...");
								tiempolimite = tiempolimite - 7;
								break;
							}
							System.out.println("Vaya, hay algo que la echa para atras..");
							System.out.println("Parece que tiene novio y se siente sucia");
							System.out.println("Que haces? tratas de CONVENCERLA o te CALLAS?");
							respuesta = scann.next();
							if (respuesta.equals("CONVENCERLA")) {
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println("Te curras una respuesta que fliipas");
									System.out.println("Te la follas");
									random = (int) (Math.random() * (25 - 14 + 1) + 14);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;
								case 2:
									System.err.println("Se lo toma mal y te manda a paseo");
									System.exit(0);
									break;
								}
								break;
							} else if (respuesta.equals("CALLAS")) {
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println("Aunque poco la dura la preocupacion..");
									System.out.println("Te la follas");
									random = (int) (Math.random() * (30 - 20 + 1) + 20);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;

								case 2:
									System.out.println("Se hace la dura, parece que quiere que la incites..");
									System.out.println("Que hacemos locoo? La INCITAS o PASAS?");
									respuesta = scann.next();
									if (respuesta.equals("INCITAS")) {
										random = (int) (Math.random() * 2 + 1);
										switch (random) {
										case 1:
											System.out.println("Hoy es tu dia de suerte, quiere que seas su papito..");
											System.out.println("ALICATAO! el camino a casa ahora será mas fructifero");
											random = (int) (Math.random() * (30 - 10 + 1) + 10);
											tiempolimite = tiempolimite - random;
											System.out.println(
													"Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
											break;

										case 2:
											System.err.println("Te has canteado demasiado.. Te ha echado");
											System.out.println("Prosigues con tu camino a casa");
											random = (int) (Math.random() * (20 - 10 + 1) + 10);
											tiempolimite = tiempolimite - random;
											System.out.println(
													"Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
											break;
										}
									} else if (respuesta.equals("PASAS")) {
										random = (int) (Math.random() * 2 + 1);
										switch (random) {
										case 1:
											System.out.println("Aun asi esta demasiado caliente y se lanza al ataque");
											random = (int) (Math.random() * (30 - 10 + 1) + 10);
											tiempolimite = tiempolimite - random;
											System.out.println(
													"Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
											break;

										case 2:
											System.err.println("- Estas muerto");
											System.exit(0);
											break;
										}
									}
									break;
								}
								break;
							}

						case 2:
							System.out.println("Putada, parece que la dejastes en casa..");
							random = (int) (Math.random() * 2 + 1);
							switch (random) {
							case 1:
								System.out.println("La piva sigue pa alante, parece que no la importa a pelo..");
								System.out.println("......");
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println("Buen polvazo campeon, te lo has ganao");
									random = (int) (Math.random() * (30 - 10 + 1) + 10);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;
								case 2:
									System.err.println("La dejas embarazada, ahora si que estas biien jodido..");
									System.exit(0);
									break;
								}
								break;

							case 2:
								System.out.println("Oh, es demasiado higienica..");
								random = (int) (Math.random() * 2 + 1);
								switch (random) {
								case 1:
									System.out.println("Aun asi, parece que va a tirar de labia...");
									System.out.println("Te mete un par de lametazos y te despacha rapido");
									random = (int) (Math.random() * (18 - 10 + 1) + 10);
									tiempolimite = tiempolimite - random;
									System.out
											.println("Pierdes " + random + " minutos------> Te quedan " + tiempolimite);
									break;

								case 2:
									System.out.println("Parece que no la chupa, estamos jodidos..");
									System.out.println("No hay mas opcion que tirar para casa");
									tiempolimite = tiempolimite - 10;
									System.out.println("Pierdes 10 minutos------> Te quedan " + tiempolimite);
									break;
								}
								break;
							}
							break;
						}
						break;
					case 3:
						System.err.println("Parece que se ralla y ademas de echarte te pega un tortazo");
						System.exit(0);
						break;
					}

				}
				break;

			case 2:
				//////// falta alternativa en su casa/////te la chupa, ver la
				//////// tele, etc//
				break;

			}

		} else if (respuesta.equals("AUXILIAS")) {

		}

	}

}
