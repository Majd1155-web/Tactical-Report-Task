const STORAGE_KEY = 'isAuthenticated';

export const auth = {
  // Check if user is authenticated
  isAuthenticated(): boolean {
    if (typeof window === 'undefined') return false;
    return localStorage.getItem(STORAGE_KEY) === 'true';
  },

  // Login with hardcoded credentials
  login(username: string, password: string): boolean {
    const isValid = username === 'admin' && password === 'password';
    if (isValid) {
      localStorage.setItem(STORAGE_KEY, 'true');
    }
    return isValid;
  },

  // Logout
  logout(): void {
    localStorage.removeItem(STORAGE_KEY);
  },
};