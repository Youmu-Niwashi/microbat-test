package microbat.instrumentation.cfgcoverage.runtime;

public interface ICoverageTracer {

	void _reachNode(String methodId, int nodeIdx);

	void enterMethod(String methodId, String paramTypeSignsCode, Object[] params);

	void _exitMethod(String methodId);

}
