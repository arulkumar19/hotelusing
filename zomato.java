import java.util.Scanner;
class zomato
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println( );
		System.out.println("\t\t\tPlease choose the Hotel\n1.A2B\n2.Ashifa\n3.SS Biriyani\n4.exit" );
		int HotelName=sc.nextInt();
		switch(HotelName)
		{
			case 1:
			{
				System.out.println("Thanks for choosing A2B :)\nPlease select your food\n1.sambar rise with vada-230.00 rs\n2.curd rise -150.00 rs\n3.veg biriyani-250.00 rs\n4.exit" );
			    int FoodName=sc.nextInt();
				switch(FoodName)
				{
					case 1:
					{
						System.out.println("you have selected sambar rise with vada\nPlease confirm your order\n1.confirm your order\n2.Cancel order");
						int response=sc.nextInt();
						switch(response)
						{
							case 1:
							{
								System.out.println("Thanks for the order conformation\nPlease select the payment method\n1.online payment\n2.COD");
								int PaymentMethod=sc.nextInt();
								switch(PaymentMethod)
								{
									case 1:
									{
										System.out.print("Thanks for choosing online payment\nPlease Enter your mobile number:");
										long MobileNumber=sc.nextLong();
										int otp=(int)(Math.random()*99999+99999);
										System.out.println("your confirmation otp is :"+otp+"\n please enter the otp");
										int OtpRecived=sc.nextInt();
										if (otp==OtpRecived)
										{
											System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing A2B ");
										}
										else
										{
											System.out.println("Entered otp is wrong try again....");
										}
										
									}
									break;
									
									case 2:
									{
										System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing A2B");
									}
									break;
									default:
									{
										System.out.println("Please choose the correct one ");
									}
								}
								
							}
							
						}
					}
					break;
					case 2:
					{
						System.out.println("you have selected curd rise\nPlease confirm your order\n1.confirm your order\n2.Cancel order");
						int response=sc.nextInt();
						switch(response)
						{
							case 1:
							{
								System.out.println("Thanks for the order conformation\nPlease select the payment method\n1.online payment\n2.COD");
								int PaymentMethod=sc.nextInt();
								switch(PaymentMethod)
								{
									case 1:
									{
										System.out.print("Thanks for choosing online payment\nPlease Enter your mobile number:");
										long MobileNumber=sc.nextLong();
										int otp=(int)(Math.random()*99999+99999);
										System.out.println("your confirmation otp is :"+otp+"\n please enter the otp");
										int OtpRecived=sc.nextInt();
										if (otp==OtpRecived)
										{
											System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing A2B ");
										}
										else
										{
											System.out.println("Entered otp is wrong try again....");
										}
										
									}
									break;
									
									case 2:
									{
										System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing A2B");
									}
									break;
									default:
									{
										System.out.println("Please choose the correct one ");
									}
								}
								
							}
							
						}
					}
					break;
					case 3:
					{
						System.out.println("you have selected veg biriyani\nPlease confirm your order\n1.confirm your order\n2.Cancel order");
						int response=sc.nextInt();
						switch(response)
						{
							case 1:
							{
								System.out.println("Thanks for the order conformation\nPlease select the payment method\n1.online payment\n2.COD");
								int PaymentMethod=sc.nextInt();
								switch(PaymentMethod)
								{
									case 1:
									{
										System.out.print("Thanks for choosing online payment\nPlease Enter your mobile number:");
										long MobileNumber=sc.nextLong();
										int otp=(int)(Math.random()*99999+99999);
										System.out.println("your confirmation otp is :"+otp+"\n please enter the otp");
										int OtpRecived=sc.nextInt();
										if (otp==OtpRecived)
										{
											System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing A2B ");
										}
										else
										{
											System.out.println("Entered otp is wrong try again....");
										}
										
									}
									break;
									
									case 2:
									{
										System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing A2B");
									}
									break;
									default:
									{
										System.out.println("Please choose the correct one ");
									}
								}
								
							}
							
						}
					}
					break;
					case 4:
					{
						System.out.println("oh oh sorry for the inconvenience ;(\n Could you tell us the reason ?\n1.yes\n2.No");
						int YesorNo=sc.nextInt();
						switch(YesorNo)
						{
							case 1:
							{
							   System.out.println("Please enter the reason:");
							   String reason=sc.next();
							   System.out.println("Thanks for your valuabel feedback!");
							   
							}
							break;
							case 2:
							{
								System.out.println("Thanks for visiting our website");
							}
							break;
							default:
							{
								System.out.println("Please choose the correct one ");
							}
						}
						
					}
					break;
					default:
					{
						System.out.println("Choose the correct one ");
					}
				}
			
			}
			break;
			case 2:
			{
				System.out.println("Thanks for choosing Ashifa :)\nPlease select your food\n1.Chicken Biriyani-250.00 rs\n2.Muttun Biriyani-300.00 rs\n3.Chicken Noodels-150.00 rs\n4.exit" );
			    int FoodName=sc.nextInt();
				switch(FoodName)
				{
					case 1:
					{
						System.out.println("you have Chicken Biriyani\nPlease confirm your order\n1.confirm your order\n2.Cancel order");
						int response=sc.nextInt();
						switch(response)
						{
							case 1:
							{
								System.out.println("Thanks for the order conformation\nPlease select the payment method\n1.online payment\n2.COD");
								int PaymentMethod=sc.nextInt();
								switch(PaymentMethod)
								{
									case 1:
									{
										System.out.print("Thanks for choosing online payment\nPlease Enter your mobile number:");
										long MobileNumber=sc.nextLong();
										int otp=(int)(Math.random()*99999+99999);
										System.out.println("your confirmation otp is :"+otp+"\n please enter the otp");
										int OtpRecived=sc.nextInt();
										if (otp==OtpRecived)
										{
											System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing Ashifa ");
										}
										else
										{
											System.out.println("Entered otp is wrong try again....");
										}
										
									}
									break;
									
									case 2:
									{
										System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing Ashifa");
									}
									break;
									default:
									{
										System.out.println("Please choose the correct one ");
									}
								}
								
							}
							
						}
					}
					break;
					case 2:
					{
						System.out.println("you have selected Muttun Biriyani\nPlease confirm your order\n1.confirm your order\n2.Cancel order");
						int response=sc.nextInt();
						switch(response)
						{
							case 1:
							{
								System.out.println("Thanks for the order conformation\nPlease select the payment method\n1.online payment\n2.COD");
								int PaymentMethod=sc.nextInt();
								switch(PaymentMethod)
								{
									case 1:
									{
										System.out.print("Thanks for choosing online payment\nPlease Enter your mobile number:");
										long MobileNumber=sc.nextLong();
										int otp=(int)(Math.random()*99999+99999);
										System.out.println("your confirmation otp is :"+otp+"\n please enter the otp");
										int OtpRecived=sc.nextInt();
										if (otp==OtpRecived)
										{
											System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing Ashifa ");
										}
										else
										{
											System.out.println("Entered otp is wrong try again....");
										}
										
									}
									break;
									
									case 2:
									{
										System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing Ashifa");
									}
									break;
									default:
									{
										System.out.println("Please choose the correct one ");
									}
								}
								
							}
							
						}
					}
					break;
					case 3:
					{
						System.out.println("you have selected Chicken Noodels\nPlease confirm your order\n1.confirm your order\n2.Cancel order");
						int response=sc.nextInt();
						switch(response)
						{
							case 1:
							{
								System.out.println("Thanks for the order conformation\nPlease select the payment method\n1.online payment\n2.COD");
								int PaymentMethod=sc.nextInt();
								switch(PaymentMethod)
								{
									case 1:
									{
										System.out.print("Thanks for choosing online payment\nPlease Enter your mobile number:");
										long MobileNumber=sc.nextLong();
										int otp=(int)(Math.random()*99999+99999);
										System.out.println("your confirmation otp is :"+otp+"\n please enter the otp");
										int OtpRecived=sc.nextInt();
										if (otp==OtpRecived)
										{
											System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing Ashifa ");
										}
										else
										{
											System.out.println("Entered otp is wrong try again....");
										}
										
									}
									break;
									
									case 2:
									{
										System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing Ashifa");
									}
									break;
									default:
									{
										System.out.println("Please choose the correct one ");
									}
								}
								
							}
							
						}
					}
					break;
					case 4:
					{
						System.out.println("oh oh sorry for the inconvenience ;(\n Could you tell us the reason ?\n1.yes\n2.No");
						int YesorNo=sc.nextInt();
						switch(YesorNo)
						{
							case 1:
							{
							   System.out.println("Please enter the reason:");
							   String reason=sc.next();
							   System.out.println("Thanks for your valuabel feedback!");
							   
							}
							break;
							case 2:
							{
								System.out.println("Thanks for visiting our website");
							}
							break;
							default:
							{
								System.out.println("Please choose the correct one ");
							}
						}
						
					}
					break;
					default:
					{
						System.out.println("Choose the correct one ");
					}
				}
			}
			break;
			case 3:
			{
				System.out.println("Thanks for choosing SS Biriyani :)\nPlease select your food\n1.Hyd.Chicken Dum Biryani-240.00 rs\n2. Prawn Biryani 260.00 rs\n3.Kaada Biryani 240.00  rs\n4.exit" );
				int FoodName=sc.nextInt();
				switch(FoodName)
				{
					case 1:
					{
						System.out.println("you have selected Chicken Dum Biryani\nPlease confirm your order\n1.confirm your order\n2.Cancel order");
						int response=sc.nextInt();
						switch(response)
						{
							case 1:
							{
								System.out.println("Thanks for the order conformation\nPlease select the payment method\n1.online payment\n2.COD");
								int PaymentMethod=sc.nextInt();
								switch(PaymentMethod)
								{
									case 1:
									{
										System.out.print("Thanks for choosing online payment\nPlease Enter your mobile number:");
										long MobileNumber=sc.nextLong();
										int otp=(int)(Math.random()*99999+99999);
										System.out.println("your confirmation otp is :"+otp+"\n please enter the otp");
										int OtpRecived=sc.nextInt();
										if (otp==OtpRecived)
										{
											System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing SS Biriyani ");
										}
										else
										{
											System.out.println("Entered otp is wrong try again....");
										}
										
									}
									break;
									
									case 2:
									{
										System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing SS Biriyani");
									}
									break;
									default:
									{
										System.out.println("Please choose the correct one ");
									}
								}
								
							}
							
						}
					}
					break;
					case 2:
					{
						System.out.println("you have selected Prawn BiryaninPlease confirm your order\n1.confirm your order\n2.Cancel order");
						int response=sc.nextInt();
						switch(response)
						{
							case 1:
							{
								System.out.println("Thanks for the order conformation\nPlease select the payment method\n1.online payment\n2.COD");
								int PaymentMethod=sc.nextInt();
								switch(PaymentMethod)
								{
									case 1:
									{
										System.out.print("Thanks for choosing online payment\nPlease Enter your mobile number:");
										long MobileNumber=sc.nextLong();
										int otp=(int)(Math.random()*99999+99999);
										System.out.println("your confirmation otp is :"+otp+"\n please enter the otp");
										int OtpRecived=sc.nextInt();
										if (otp==OtpRecived)
										{
											System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing SS Biriyani");
										}
										else
										{
											System.out.println("Entered otp is wrong try again....");
										}
										
									}
									break;
									
									case 2:
									{
										System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing SS Biriyani");
									}
									break;
									default:
									{
										System.out.println("Please choose the correct one ");
									}
								}
								
							}
							
						}
					}
					break;
					case 3:
					{
						System.out.println("you have selected Kaada Biryani\nPlease confirm your order\n1.confirm your order\n2.Cancel order");
						int response=sc.nextInt();
						switch(response)
						{
							case 1:
							{
								System.out.println("Thanks for the order conformation\nPlease select the payment method\n1.online payment\n2.COD");
								int PaymentMethod=sc.nextInt();
								switch(PaymentMethod)
								{
									case 1:
									{
										System.out.print("Thanks for choosing online payment\nPlease Enter your mobile number:");
										long MobileNumber=sc.nextLong();
										int otp=(int)(Math.random()*99999+99999);
										System.out.println("your confirmation otp is :"+otp+"\n please enter the otp");
										int OtpRecived=sc.nextInt();
										if (otp==OtpRecived)
										{
											System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing SS Biriyani");
										}
										else
										{
											System.out.println("Entered otp is wrong try again....");
										}
										
									}
									break;
									
									case 2:
									{
										System.out.println("Payment Successful.....\nYour order is confirmed\nThanks for choosing SS Biriyani");
									}
									break;
									default:
									{
										System.out.println("Please choose the correct one ");
									}
								}
								
							}
							
						}
					}
					break;
					case 4:
					{
						System.out.println("oh oh sorry for the inconvenience ;(\n Could you tell us the reason ?\n1.yes\n2.No");
						int YesorNo=sc.nextInt();
						switch(YesorNo)
						{
							case 1:
							{
							   System.out.println("Please enter the reason:");
							   String reason=sc.next();
							   System.out.println("Thanks for your valuabel feedback!");
							   
							}
							break;
							case 2:
							{
								System.out.println("Thanks for visiting our website");
							}
							break;
							default:
							{
								System.out.println("Please choose the correct one ");
							}
						}
						
					}
					break;
					default:
					{
						System.out.println("Choose the correct one ");
					}
				}
			}
			break;
			case 4:
			{
				System.out.println("Sorry to hear that \nRevisit again");
			}
			default:
			{
				System.out.println("Choose the correct hotel");
			}
		}
		
	}
}
