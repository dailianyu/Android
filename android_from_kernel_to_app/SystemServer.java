try {
    Slog.i(TAG, "Hello Service");
    ServiceManager.addService("hello", new HelloService());
} catch (Throwable e) {
    Slog.e(TAG, "Failure starting Hello Service", e);
}
