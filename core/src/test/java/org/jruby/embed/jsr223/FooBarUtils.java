package org.jruby.embed.jsr223;

public class FooBarUtils
{
	private final String foo;
	private final String bar;
	
	public FooBarUtils()
	{
		this.foo = "foo";
		this.bar = "bar";
	}
	
	public String foo()
	{
		return foo;
	}
	
	public String bar()
	{
		return bar;
	}
}
