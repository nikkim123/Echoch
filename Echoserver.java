mport java.io.*;
import java.net.*;

public class EchoServer
{
public static void main(String args[]) throws Exception
{
try
{
int Port;
BufferedReader Buf =new BufferedReader(new
InputStreamReader(System.in));
System.out.print(" Enter the Port Address : " );
Port=Integer.parseInt(Buf.readLine());
ServerSocket sok =new ServerSocket(Port);
System.out.println(" Server is Ready To Receive a Message. ");
System.out.println(" Waiting ..... ");

Socket so=sok.accept();
