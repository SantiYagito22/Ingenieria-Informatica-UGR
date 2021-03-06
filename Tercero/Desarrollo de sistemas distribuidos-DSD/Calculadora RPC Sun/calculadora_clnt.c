/*
 * Please do not edit this file.
 * It was generated using rpcgen.
 */

#include <memory.h> /* for memset */
#include "calculadora.h"

/* Default timeout can be changed using clnt_control() */
static struct timeval TIMEOUT = { 25, 0 };

double *
sumar_1(operandoBasico arg1,  CLIENT *clnt)
{
	static double clnt_res;

	memset((char *)&clnt_res, 0, sizeof(clnt_res));
	if (clnt_call (clnt, SUMAR,
		(xdrproc_t) xdr_operandoBasico, (caddr_t) &arg1,
		(xdrproc_t) xdr_double, (caddr_t) &clnt_res,
		TIMEOUT) != RPC_SUCCESS) {
		return (NULL);
	}
	return (&clnt_res);
}

double *
restar_1(operandoBasico arg1,  CLIENT *clnt)
{
	static double clnt_res;

	memset((char *)&clnt_res, 0, sizeof(clnt_res));
	if (clnt_call (clnt, RESTAR,
		(xdrproc_t) xdr_operandoBasico, (caddr_t) &arg1,
		(xdrproc_t) xdr_double, (caddr_t) &clnt_res,
		TIMEOUT) != RPC_SUCCESS) {
		return (NULL);
	}
	return (&clnt_res);
}

double *
division_1(operandoBasico arg1,  CLIENT *clnt)
{
	static double clnt_res;

	memset((char *)&clnt_res, 0, sizeof(clnt_res));
	if (clnt_call (clnt, DIVISION,
		(xdrproc_t) xdr_operandoBasico, (caddr_t) &arg1,
		(xdrproc_t) xdr_double, (caddr_t) &clnt_res,
		TIMEOUT) != RPC_SUCCESS) {
		return (NULL);
	}
	return (&clnt_res);
}

double *
multiplicar_1(operandoBasico arg1,  CLIENT *clnt)
{
	static double clnt_res;

	memset((char *)&clnt_res, 0, sizeof(clnt_res));
	if (clnt_call (clnt, MULTIPLICAR,
		(xdrproc_t) xdr_operandoBasico, (caddr_t) &arg1,
		(xdrproc_t) xdr_double, (caddr_t) &clnt_res,
		TIMEOUT) != RPC_SUCCESS) {
		return (NULL);
	}
	return (&clnt_res);
}

double *
combinada_2(Num arg1, Ope arg2,  CLIENT *clnt)
{
	combinada_2_argument arg;
	static double clnt_res;

	memset((char *)&clnt_res, 0, sizeof(clnt_res));
	arg.arg1 = arg1;
	arg.arg2 = arg2;
	if (clnt_call (clnt, Combinada, (xdrproc_t) xdr_combinada_2_argument, (caddr_t) &arg,
		(xdrproc_t) xdr_double, (caddr_t) &clnt_res,
		TIMEOUT) != RPC_SUCCESS) {
		return (NULL);
	}
	return (&clnt_res);
}

vec *
sumavector_3(vec arg1, vec arg2,  CLIENT *clnt)
{
	sumavector_3_argument arg;
	static vec clnt_res;

	memset((char *)&clnt_res, 0, sizeof(clnt_res));
	arg.arg1 = arg1;
	arg.arg2 = arg2;
	if (clnt_call (clnt, SUMAVECTOR, (xdrproc_t) xdr_sumavector_3_argument, (caddr_t) &arg,
		(xdrproc_t) xdr_vec, (caddr_t) &clnt_res,
		TIMEOUT) != RPC_SUCCESS) {
		return (NULL);
	}
	return (&clnt_res);
}

vec *
restavector_3(vec arg1, vec arg2,  CLIENT *clnt)
{
	restavector_3_argument arg;
	static vec clnt_res;

	memset((char *)&clnt_res, 0, sizeof(clnt_res));
	arg.arg1 = arg1;
	arg.arg2 = arg2;
	if (clnt_call (clnt, RESTAVECTOR, (xdrproc_t) xdr_restavector_3_argument, (caddr_t) &arg,
		(xdrproc_t) xdr_vec, (caddr_t) &clnt_res,
		TIMEOUT) != RPC_SUCCESS) {
		return (NULL);
	}
	return (&clnt_res);
}

vec *
multiplicarvector_3(vec arg1, vec arg2,  CLIENT *clnt)
{
	multiplicarvector_3_argument arg;
	static vec clnt_res;

	memset((char *)&clnt_res, 0, sizeof(clnt_res));
	arg.arg1 = arg1;
	arg.arg2 = arg2;
	if (clnt_call (clnt, MULTIPLICARVECTOR, (xdrproc_t) xdr_multiplicarvector_3_argument, (caddr_t) &arg,
		(xdrproc_t) xdr_vec, (caddr_t) &clnt_res,
		TIMEOUT) != RPC_SUCCESS) {
		return (NULL);
	}
	return (&clnt_res);
}

vec *
dividirvector_3(vec arg1, vec arg2,  CLIENT *clnt)
{
	dividirvector_3_argument arg;
	static vec clnt_res;

	memset((char *)&clnt_res, 0, sizeof(clnt_res));
	arg.arg1 = arg1;
	arg.arg2 = arg2;
	if (clnt_call (clnt, DIVIDIRVECTOR, (xdrproc_t) xdr_dividirvector_3_argument, (caddr_t) &arg,
		(xdrproc_t) xdr_vec, (caddr_t) &clnt_res,
		TIMEOUT) != RPC_SUCCESS) {
		return (NULL);
	}
	return (&clnt_res);
}

double *
escalar_3(vec arg1, vec arg2,  CLIENT *clnt)
{
	escalar_3_argument arg;
	static double clnt_res;

	memset((char *)&clnt_res, 0, sizeof(clnt_res));
	arg.arg1 = arg1;
	arg.arg2 = arg2;
	if (clnt_call (clnt, ESCALAR, (xdrproc_t) xdr_escalar_3_argument, (caddr_t) &arg,
		(xdrproc_t) xdr_double, (caddr_t) &clnt_res,
		TIMEOUT) != RPC_SUCCESS) {
		return (NULL);
	}
	return (&clnt_res);
}

vec *
ecuacioncuadratica_4(double arg1, double arg2, double arg3,  CLIENT *clnt)
{
	ecuacioncuadratica_4_argument arg;
	static vec clnt_res;

	memset((char *)&clnt_res, 0, sizeof(clnt_res));
	arg.arg1 = arg1;
	arg.arg2 = arg2;
	arg.arg3 = arg3;
	if (clnt_call (clnt, ECUACIONCUADRATICA, (xdrproc_t) xdr_ecuacioncuadratica_4_argument, (caddr_t) &arg,
		(xdrproc_t) xdr_vec, (caddr_t) &clnt_res,
		TIMEOUT) != RPC_SUCCESS) {
		return (NULL);
	}
	return (&clnt_res);
}
